package com.ntm.internal.word;

import com.ntm.internal.constants.Constants;
import com.ntm.internal.converter.WordConvertor;

import com.ntm.internal.converter.impl.*;

public  class ConvertNumberToWords {

  public  String numberToWords(long inputNumber){
      try {
          return getNumbertoWordObject().convertNumberAsWord(inputNumber).toString().trim();
      }
      catch(IllegalArgumentException e){
          return Constants.NOT_VALID_NUMBER;
      }
  }

  private NumbertoWordConverter getNumbertoWordObject(){
      WordConvertor integerConvertor =new WordsOfHundred(new OnesToWordConverterImpl(),
              new TensToWordConverter(), new HundredToWordsConverter());
      return new NumbertoWordConverter(integerConvertor);
  }

}
