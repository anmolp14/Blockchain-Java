package in.ac.iitk.cse.cs252.transactions;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.Utils;
import org.bitcoinj.script.Script;
import org.bitcoinj.script.ScriptBuilder;
import org.bitcoinj.core.ECKey;
import java.io.File;
import java.math.BigInteger;
import java.net.UnknownHostException;
import org.bitcoinj.crypto.TransactionSignature;

import static org.bitcoinj.script.ScriptOpCodes.*;

/**
 * Created by bbuenz on 24.09.15.
 */
public class LinearEquationTransaction extends ScriptTransaction {
    ECKey key;

    // TODO: Problem 2
    public LinearEquationTransaction(NetworkParameters parameters, File file, String password) {
        super(parameters, file, password);
        key = getWallet().freshReceiveKey();    
    }

    @Override
    public Script createInputScript() {
            ScriptBuilder builder = new ScriptBuilder();
            builder.op(OP_2DUP);
            builder.op(OP_SUB);
            builder.op(OP_ABS);
            builder.data(encode(new BigInteger("108")));
            builder.op(OP_EQUALVERIFY);
            builder.op(OP_ADD);
            builder.data(encode(new BigInteger("150")));
            builder.op(OP_EQUAL);
            Script s = builder.build();
            System.out.println(""+s.toString());            
            return s;
    }

    @Override
    public Script createRedemptionScript(Transaction unsignedScript) {
            TransactionSignature txSig = sign(unsignedScript, key);        
            ScriptBuilder builder = new ScriptBuilder();
            builder.data(encode(new BigInteger("129")));
            builder.data(encode(new BigInteger("21")));
            Script s = builder.build();
            System.out.println(""+s.toString());
            return s;
    }

    private byte[] encode(BigInteger bigInteger) {
        return Utils.reverseBytes(Utils.encodeMPI(bigInteger, false));
    }
}
