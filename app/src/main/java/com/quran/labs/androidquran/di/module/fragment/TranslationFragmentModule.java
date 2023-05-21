package com.quran.labs.androidquran.di.module.fragment;

import com.quran.labs.androidquran.ui.translation.ScrollPositionManager;
import com.quran.labs.androidquran.ui.translation.TranslationView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class TranslationFragmentModule {

  @Provides
  static ScrollPositionManager provideScrollPositionManager(TranslationView view) {
    return view;
  }


  @Provides
  TranslationView provideTranslationView() {
    return new TranslationView();
  }

  @Binds
  abstract ScrollPositionManager bindScrollPositionManager(TranslationView view);
}
