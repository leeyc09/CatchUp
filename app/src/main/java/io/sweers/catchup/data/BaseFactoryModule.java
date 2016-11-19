package io.sweers.catchup.data;

import com.squareup.moshi.JsonAdapter;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.multibindings.IntoSet;

@Module
public abstract class BaseFactoryModule {

    @Provides
    @Reusable
    @IntoSet
    static JsonAdapter.Factory provideNoopFactory() {
        return (type, annotations, moshi) -> null;
    }

}
