package org.web3j.protocol.core.generated;

import java.util.List;

import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.protocol.core.AbstractRemoteCall;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.TransactionManager;

public class RemoteCall2<T1, T2> extends AbstractRemoteCall<Tuple2<T1, T2>> {

    public RemoteCall2(
            final Function function,
            final String contractAddress,
            final boolean useNativeJavaTypes,
            final TransactionManager transactionManager,
            final DefaultBlockParameter defaultBlockParameter) {
        super(function, contractAddress, useNativeJavaTypes, transactionManager, defaultBlockParameter);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Tuple2<T1, T2> convert(final List<Type<?>> values) {
        return new Tuple2<>(
                ((T1) (useNativeJavaTypes() ? values.get(0).getValue() : values.get(0))),
                ((T2) (useNativeJavaTypes() ? values.get(1).getValue() : values.get(1)))
        );
    }
}
