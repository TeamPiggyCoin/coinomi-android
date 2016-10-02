package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

public class PiggyCoinMain extends PeerFamily {
    private PiggyCoinMain() {
        id = "piggycoin.main";

        addressHeader = 118;
        p2shHeader = 28;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 60;
        dumpedPrivateKeyHeader = 246;

        name = "PiggyCoin";
        symbol = "PIGGY";
        uriScheme = "piggycoin";
        bip44Index = 118;
        unitExponent = 8;
        feeValue = value(100000); // 0.001
        minNonDust = value(100000); // 0.001
        softDustLimit = value(10000); // 0.01
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("PiggyCoin Signed Message:\n");
    }

    private static PiggyCoinMain instance = new PiggyCoinMain();
    public static synchronized PiggyCoinMain get() {
        return instance;
    }
}
