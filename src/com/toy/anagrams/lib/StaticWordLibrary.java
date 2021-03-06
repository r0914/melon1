/*
 * Copyright (c) 2010, Oracle.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  * Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* Anagram Game Application */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
        "abstraction",
        "ambiguous",
        "arithmetic",
        "backslash",
        "bitmap",
        "circumstance",
        "combination",
        "consequently",
        "consortium",
        "decrementing",
        "dependency",
        "disambiguate",
        "dynamic",
        "encapsulation",
        "equivalent",
        "expression",
        "facilitate",
        "fragment",
        "hexadecimal",
        "implementation",
        "indistinguishable",
        "inheritance",
        "internet",
        "java",
        "localization",
        "microprocessor",
        "navigation",
        "optimization",
        "parameter",
        "patrick",
        "pickle",
        "polymorphic",
        "rigorously",
        "simultaneously",
        "specification",
        "structure",
        "lexical",
        "likewise",
        "management",
        "manipulate",
        "mathematics",
        "hotjava",
        "vertex",
        "unsigned",
        "traditional",
        "mountain",
        "book",
        "bell",
        "tree"
        };

    //private String[] SCRAMBLED_WORD_LIST;
    private String[] SCRAMBLED_WORD_LIST_LEVEL1;
    private String[] SCRAMBLED_WORD_LIST_LEVEL2;
    private String[] SCRAMBLED_WORD_LIST_LEVEL3;

    /*private static final String[] SCRAMBLED_WORD_LIST = {
        "batsartcoin",
        "maibuguos",
        "ratimhteci",
        "abkclssha",
        "ibmtpa",
        "iccrmutsnaec",
        "ocbmnitaoni",
        "ocsnqeeutnyl",
        "ocsnroitmu",
        "edrcmeneitgn",
        "edepdnneyc",
        "idasbmgiauet",
        "ydanicm",
        "neacsplutaoni",
        "qeiuaveltn",
        "xerpseisno",
        "aficilatet",
        "rfgaemtn",
        "ehaxedicalm",
        "milpmeneatitno",
        "niidtsniugsiahleb",
        "niehiratcen",
        "nietnret",
        "ajav",
        "olacilazitno",
        "imrcpoorecssro",
        "anivagitno",
        "poitimazitno",
        "aparemert",
        "aprtcki",
        "ipkcel",
        "opylomprich",
        "irogorsuyl",
        "isumtlnaoesuyl",
        "psceficitaoni",
        "tsurtcreu",
        "elixalc",
        "ilekiwse",
        "amanegemtn",
        "aminupalet",
        "amhtmetacsi",
        "ohjtvaa",
        "evtrxe",
        "nuisngde",
        "rtdatioialn",
        "mutionan",
        "boko",
        "blel",
        "tere"
        };*/

    final static WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    private StaticWordLibrary() {
    	//SCRAMBLED_WORD_LIST=sortWords(0);//引数で変更の文字数の指定
    	SCRAMBLED_WORD_LIST_LEVEL1=sortWords(1);
    	SCRAMBLED_WORD_LIST_LEVEL2=sortWords(2);
    	SCRAMBLED_WORD_LIST_LEVEL3=sortWords(3);
    }

    /**
     * Gets the word at a given index.
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord_LEVEL1(int idx) {
    	//ここでレベルごとにreturn
        return SCRAMBLED_WORD_LIST_LEVEL1[idx];
    }
    public String getScrambledWord_LEVEL2(int idx) {
    	//ここでレベルごとにreturn
        return SCRAMBLED_WORD_LIST_LEVEL2[idx];
    }
    public String getScrambledWord_LEVEL3(int idx) {
    	//ここでレベルごとにreturn
        return SCRAMBLED_WORD_LIST_LEVEL3[idx];
    }
   /* 
    * public String getScrambledWord(int idx) {
    	//ここでレベルごとにreturn
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }


    public String[] sortWords(int level) {
    	int n=WORD_LIST.length;
    	String[] array=new String[n];
    	for(int i=0;i<n;i++) {
    		char[] s=WORD_LIST[i].toCharArray();
    		
    		int count=0;
    		if(level==1) 
    			count=s.length-1;
    	else if(level==2) 
    			count=s.length/2;
    		
    	else if(level==3)
    			count=s.length/3;
    			
    			for(int j=count;j>0;j--) {
    			int index=new java.util.Random().nextInt(j);
    			char temp=s[index];
    			s[index]=s[j];
    			s[j]=temp;
    		}
    		array[i]=new String(s);
    	}
    	return array;
    }
}
