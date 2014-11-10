package com.jc.elementos.model;

// KXEN InfiniteInsight - Nicolas Dulian_PC_2 - KXEN Internal Use Only 6.1.0 - Copyright KXEN (c) 1999-2012 - Model built in 6.1.0 - Model Name is class_int_Census_withDate - Model Version is 1 
//	Code compilation needs KxJRT.jar in the classpath as shown below:
//		javac -classpath "path-to-KxJRT.jar" SampleModel.java
//	where "model.java" is the generated java code.
//	This generates a file named "model.class" that contains java bytecode.

//	This runtime is available in the product directory in EXE/KCG/KxJavaRT.
//	In addition, in this directory, a small HOW TO is available (index.html).
//	Please refer to this file to compile and execute exported model in JAVA code.

import KxJRT.*;
import java.util.*;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.charset.Charset;

public class SampleModel implements IKxJModel {


	private static Charset sCharset;
	private static String[] mInputVariables = new String[17];
	private static String[] mOutputVariables = new String[1];
	private static String[][] mCategories = new String[17][0];
	private static String[] mMissingStrings = new String[17];
	static {
		try {
			sCharset = Charset.forName("UTF-8");
		} catch(UnsupportedCharsetException e) {
			throw new RuntimeException("UTF-8 Charset not supported, this should not occur");
		}
		initializeInputVariable0();
		initializeInputVariable1();
		initializeInputVariable2();
		initializeInputVariable3();
		initializeInputVariable4();
		initializeInputVariable5();
		initializeInputVariable6();
		initializeInputVariable7();
		initializeInputVariable8();
		initializeInputVariable9();
		initializeInputVariable10();
		initializeInputVariable11();
		initializeInputVariable12();
		initializeInputVariable13();
		initializeInputVariable14();
		initializeInputVariable15();
		initializeInputVariable16();
		initializeOutputVariable0();
	}

	public String[] getModelInputVariables() {
		return mInputVariables;
	}

	public String[] getModelOutputVariables() {
		return mOutputVariables;
	}

	private int doublesegcmp(double iX, double iXStart, int iEqualStart, double iXEnd, int iEqualEnd) {
		if ((double)iX < (double)iXStart) return -2;
		if ((double)iX == (double)iXStart)	{
			if (1 == iEqualStart) return 0;
			else return -1;
		}
		else {
			if ((double)iX < (double)iXEnd) return 0;
			if ((double)iX == (double)iXEnd) {
				if (1 == iEqualEnd) return 0;
				else return 1;
			}
			else {
				return 2;
			}
		}
	}

	private int doublecmp(double id1, double if2) {
		return ((double)id1 == if2 )?0:1;
	}

	private int strcmp( String iS1, String iS2 ) {
		return iS1.equals(iS2)?0:1;
	}

	public SampleModel() {}
	//age_int
	private static void initializeInputVariable0() {
		byte[] lInput = {97, 103, 101, 95, 105, 110, 116};
		mInputVariables[0] = new String(lInput, sCharset);
	}
	//age_num
	private static void initializeInputVariable1() {
		byte[] lInput = {97, 103, 101, 95, 110, 117, 109};
		mInputVariables[1] = new String(lInput, sCharset);
	}
	//fnlwgt
	private static void initializeInputVariable2() {
		byte[] lInput = {102, 110, 108, 119, 103, 116};
		mInputVariables[2] = new String(lInput, sCharset);
	}
	//fnlwgt_num
	private static void initializeInputVariable3() {
		byte[] lInput = {102, 110, 108, 119, 103, 116, 95, 110, 117, 109};
		mInputVariables[3] = new String(lInput, sCharset);
	}
	//edu
	private static void initializeInputVariable4() {
		byte[] lInput = {101, 100, 117};
		mInputVariables[4] = new String(lInput, sCharset);
		mCategories[4] = new String[11];
		byte[] lCategory4_0 = {72, 83, 45, 103, 114, 97, 100};
		mCategories[4][0] = new String(lCategory4_0, sCharset);
		byte[] lCategory4_1 = {83, 111, 109, 101, 45, 99, 111, 108, 108, 101, 103, 101};
		mCategories[4][1] = new String(lCategory4_1, sCharset);
		byte[] lCategory4_2 = {66, 97, 99, 104, 101, 108, 111, 114, 115};
		mCategories[4][2] = new String(lCategory4_2, sCharset);
		byte[] lCategory4_3 = {75, 120, 79, 116, 104, 101, 114};
		mCategories[4][3] = new String(lCategory4_3, sCharset);
		byte[] lCategory4_4 = {77, 97, 115, 116, 101, 114, 115};
		mCategories[4][4] = new String(lCategory4_4, sCharset);
		byte[] lCategory4_5 = {65, 115, 115, 111, 99, 45, 118, 111, 99};
		mCategories[4][5] = new String(lCategory4_5, sCharset);
		byte[] lCategory4_6 = {65, 115, 115, 111, 99, 45, 97, 99, 100, 109};
		mCategories[4][6] = new String(lCategory4_6, sCharset);
		byte[] lCategory4_7 = {55, 116, 104, 45, 56, 116, 104};
		mCategories[4][7] = new String(lCategory4_7, sCharset);
		byte[] lCategory4_8 = {80, 114, 111, 102, 45, 115, 99, 104, 111, 111, 108};
		mCategories[4][8] = new String(lCategory4_8, sCharset);
		byte[] lCategory4_9 = {49, 50, 116, 104};
		mCategories[4][9] = new String(lCategory4_9, sCharset);
		byte[] lCategory4_10 = {68, 111, 99, 116, 111, 114, 97, 116, 101};
		mCategories[4][10] = new String(lCategory4_10, sCharset);
	}
	//edu_int
	private static void initializeInputVariable5() {
		byte[] lInput = {101, 100, 117, 95, 105, 110, 116};
		mInputVariables[5] = new String(lInput, sCharset);
		mCategories[5] = new String[16];
		byte[] lCategory5_0 = {57};
		mCategories[5][0] = new String(lCategory5_0, sCharset);
		byte[] lCategory5_1 = {49, 48};
		mCategories[5][1] = new String(lCategory5_1, sCharset);
		byte[] lCategory5_2 = {49, 51};
		mCategories[5][2] = new String(lCategory5_2, sCharset);
		byte[] lCategory5_3 = {49, 52};
		mCategories[5][3] = new String(lCategory5_3, sCharset);
		byte[] lCategory5_4 = {49, 49};
		mCategories[5][4] = new String(lCategory5_4, sCharset);
		byte[] lCategory5_5 = {55};
		mCategories[5][5] = new String(lCategory5_5, sCharset);
		byte[] lCategory5_6 = {49, 50};
		mCategories[5][6] = new String(lCategory5_6, sCharset);
		byte[] lCategory5_7 = {54};
		mCategories[5][7] = new String(lCategory5_7, sCharset);
		byte[] lCategory5_8 = {52};
		mCategories[5][8] = new String(lCategory5_8, sCharset);
		byte[] lCategory5_9 = {49, 53};
		mCategories[5][9] = new String(lCategory5_9, sCharset);
		byte[] lCategory5_10 = {53};
		mCategories[5][10] = new String(lCategory5_10, sCharset);
		byte[] lCategory5_11 = {56};
		mCategories[5][11] = new String(lCategory5_11, sCharset);
		byte[] lCategory5_12 = {49, 54};
		mCategories[5][12] = new String(lCategory5_12, sCharset);
		byte[] lCategory5_13 = {51};
		mCategories[5][13] = new String(lCategory5_13, sCharset);
		byte[] lCategory5_14 = {50};
		mCategories[5][14] = new String(lCategory5_14, sCharset);
		byte[] lCategory5_15 = {49};
		mCategories[5][15] = new String(lCategory5_15, sCharset);
	}
	//edu_num
	private static void initializeInputVariable6() {
		byte[] lInput = {101, 100, 117, 95, 110, 117, 109};
		mInputVariables[6] = new String(lInput, sCharset);
	}
	//edu_str
	private static void initializeInputVariable7() {
		byte[] lInput = {101, 100, 117, 95, 115, 116, 114};
		mInputVariables[7] = new String(lInput, sCharset);
		mCategories[7] = new String[11];
		byte[] lCategory7_0 = {73};
		mCategories[7][0] = new String(lCategory7_0, sCharset);
		byte[] lCategory7_1 = {74};
		mCategories[7][1] = new String(lCategory7_1, sCharset);
		byte[] lCategory7_2 = {77};
		mCategories[7][2] = new String(lCategory7_2, sCharset);
		byte[] lCategory7_3 = {75, 120, 79, 116, 104, 101, 114};
		mCategories[7][3] = new String(lCategory7_3, sCharset);
		byte[] lCategory7_4 = {78};
		mCategories[7][4] = new String(lCategory7_4, sCharset);
		byte[] lCategory7_5 = {75};
		mCategories[7][5] = new String(lCategory7_5, sCharset);
		byte[] lCategory7_6 = {76};
		mCategories[7][6] = new String(lCategory7_6, sCharset);
		byte[] lCategory7_7 = {68};
		mCategories[7][7] = new String(lCategory7_7, sCharset);
		byte[] lCategory7_8 = {79};
		mCategories[7][8] = new String(lCategory7_8, sCharset);
		byte[] lCategory7_9 = {72};
		mCategories[7][9] = new String(lCategory7_9, sCharset);
		byte[] lCategory7_10 = {80};
		mCategories[7][10] = new String(lCategory7_10, sCharset);
	}
	//marit
	private static void initializeInputVariable8() {
		byte[] lInput = {109, 97, 114, 105, 116};
		mInputVariables[8] = new String(lInput, sCharset);
		mCategories[8] = new String[4];
		byte[] lCategory8_0 = {77, 97, 114, 114, 105, 101, 100, 45, 99, 105, 118, 45, 115, 112, 111, 117, 115, 101};
		mCategories[8][0] = new String(lCategory8_0, sCharset);
		byte[] lCategory8_1 = {78, 101, 118, 101, 114, 45, 109, 97, 114, 114, 105, 101, 100};
		mCategories[8][1] = new String(lCategory8_1, sCharset);
		byte[] lCategory8_2 = {68, 105, 118, 111, 114, 99, 101, 100};
		mCategories[8][2] = new String(lCategory8_2, sCharset);
		byte[] lCategory8_3 = {75, 120, 79, 116, 104, 101, 114};
		mCategories[8][3] = new String(lCategory8_3, sCharset);
	}
	//marit_int
	private static void initializeInputVariable9() {
		byte[] lInput = {109, 97, 114, 105, 116, 95, 105, 110, 116};
		mInputVariables[9] = new String(lInput, sCharset);
		mCategories[9] = new String[7];
		byte[] lCategory9_0 = {49};
		mCategories[9][0] = new String(lCategory9_0, sCharset);
		byte[] lCategory9_1 = {48};
		mCategories[9][1] = new String(lCategory9_1, sCharset);
		byte[] lCategory9_2 = {50};
		mCategories[9][2] = new String(lCategory9_2, sCharset);
		byte[] lCategory9_3 = {52};
		mCategories[9][3] = new String(lCategory9_3, sCharset);
		byte[] lCategory9_4 = {54};
		mCategories[9][4] = new String(lCategory9_4, sCharset);
		byte[] lCategory9_5 = {51};
		mCategories[9][5] = new String(lCategory9_5, sCharset);
		byte[] lCategory9_6 = {53};
		mCategories[9][6] = new String(lCategory9_6, sCharset);
	}
	//marit_num
	private static void initializeInputVariable10() {
		byte[] lInput = {109, 97, 114, 105, 116, 95, 110, 117, 109};
		mInputVariables[10] = new String(lInput, sCharset);
	}
	//age_date
	private static void initializeInputVariable11() {
		byte[] lInput = {97, 103, 101, 95, 100, 97, 116, 101};
		mInputVariables[11] = new String(lInput, sCharset);
		mCategories[11] = new String[3];
		byte[] lCategory11_0 = {50};
		mCategories[11][0] = new String(lCategory11_0, sCharset);
		byte[] lCategory11_1 = {49};
		mCategories[11][1] = new String(lCategory11_1, sCharset);
		byte[] lCategory11_2 = {51};
		mCategories[11][2] = new String(lCategory11_2, sCharset);
		mCategories[11] = new String[7];
		byte[] lCategory13_0 = {52};
		mCategories[11][0] = new String(lCategory13_0, sCharset);
		byte[] lCategory13_1 = {53};
		mCategories[11][1] = new String(lCategory13_1, sCharset);
		byte[] lCategory13_2 = {54};
		mCategories[11][2] = new String(lCategory13_2, sCharset);
		byte[] lCategory13_3 = {50};
		mCategories[11][3] = new String(lCategory13_3, sCharset);
		byte[] lCategory13_4 = {48};
		mCategories[11][4] = new String(lCategory13_4, sCharset);
		byte[] lCategory13_5 = {51};
		mCategories[11][5] = new String(lCategory13_5, sCharset);
		byte[] lCategory13_6 = {49};
		mCategories[11][6] = new String(lCategory13_6, sCharset);
		mCategories[11] = new String[3];
		byte[] lCategory15_0 = {50};
		mCategories[11][0] = new String(lCategory15_0, sCharset);
		byte[] lCategory15_1 = {49};
		mCategories[11][1] = new String(lCategory15_1, sCharset);
		byte[] lCategory15_2 = {51};
		mCategories[11][2] = new String(lCategory15_2, sCharset);
	}
	//age_time
	private static void initializeInputVariable12() {
		byte[] lInput = {97, 103, 101, 95, 116, 105, 109, 101};
		mInputVariables[12] = new String(lInput, sCharset);
		mCategories[12] = new String[7];
		byte[] lCategory19_0 = {51};
		mCategories[12][0] = new String(lCategory19_0, sCharset);
		byte[] lCategory19_1 = {50};
		mCategories[12][1] = new String(lCategory19_1, sCharset);
		byte[] lCategory19_2 = {52};
		mCategories[12][2] = new String(lCategory19_2, sCharset);
		byte[] lCategory19_3 = {53};
		mCategories[12][3] = new String(lCategory19_3, sCharset);
		byte[] lCategory19_4 = {54};
		mCategories[12][4] = new String(lCategory19_4, sCharset);
		byte[] lCategory19_5 = {49};
		mCategories[12][5] = new String(lCategory19_5, sCharset);
		byte[] lCategory19_6 = {48};
		mCategories[12][6] = new String(lCategory19_6, sCharset);
	}
	//edu_date
	private static void initializeInputVariable13() {
		byte[] lInput = {101, 100, 117, 95, 100, 97, 116, 101};
		mInputVariables[13] = new String(lInput, sCharset);
		mCategories[13] = new String[2];
		byte[] lCategory21_0 = {55};
		mCategories[13][0] = new String(lCategory21_0, sCharset);
		byte[] lCategory21_1 = {54};
		mCategories[13][1] = new String(lCategory21_1, sCharset);
		mCategories[13] = new String[7];
		byte[] lCategory23_0 = {54};
		mCategories[13][0] = new String(lCategory23_0, sCharset);
		byte[] lCategory23_1 = {48};
		mCategories[13][1] = new String(lCategory23_1, sCharset);
		byte[] lCategory23_2 = {51};
		mCategories[13][2] = new String(lCategory23_2, sCharset);
		byte[] lCategory23_3 = {52};
		mCategories[13][3] = new String(lCategory23_3, sCharset);
		byte[] lCategory23_4 = {49};
		mCategories[13][4] = new String(lCategory23_4, sCharset);
		byte[] lCategory23_5 = {50};
		mCategories[13][5] = new String(lCategory23_5, sCharset);
		byte[] lCategory23_6 = {53};
		mCategories[13][6] = new String(lCategory23_6, sCharset);
		mCategories[13] = new String[2];
		byte[] lCategory25_0 = {51};
		mCategories[13][0] = new String(lCategory25_0, sCharset);
		byte[] lCategory25_1 = {50};
		mCategories[13][1] = new String(lCategory25_1, sCharset);
		mCategories[13] = new String[2];
		byte[] lCategory26_0 = {49};
		mCategories[13][0] = new String(lCategory26_0, sCharset);
		byte[] lCategory26_1 = {51};
		mCategories[13][1] = new String(lCategory26_1, sCharset);
	}
	//edu_time
	private static void initializeInputVariable14() {
		byte[] lInput = {101, 100, 117, 95, 116, 105, 109, 101};
		mInputVariables[14] = new String(lInput, sCharset);
		mCategories[14] = new String[2];
		byte[] lCategory30_0 = {49};
		mCategories[14][0] = new String(lCategory30_0, sCharset);
		byte[] lCategory30_1 = {48};
		mCategories[14][1] = new String(lCategory30_1, sCharset);
	}
	//marit_date
	private static void initializeInputVariable15() {
		byte[] lInput = {109, 97, 114, 105, 116, 95, 100, 97, 116, 101};
		mInputVariables[15] = new String(lInput, sCharset);
		mCategories[15] = new String[7];
		byte[] lCategory33_0 = {53};
		mCategories[15][0] = new String(lCategory33_0, sCharset);
		byte[] lCategory33_1 = {52};
		mCategories[15][1] = new String(lCategory33_1, sCharset);
		byte[] lCategory33_2 = {54};
		mCategories[15][2] = new String(lCategory33_2, sCharset);
		byte[] lCategory33_3 = {49};
		mCategories[15][3] = new String(lCategory33_3, sCharset);
		byte[] lCategory33_4 = {51};
		mCategories[15][4] = new String(lCategory33_4, sCharset);
		byte[] lCategory33_5 = {48};
		mCategories[15][5] = new String(lCategory33_5, sCharset);
		byte[] lCategory33_6 = {50};
		mCategories[15][6] = new String(lCategory33_6, sCharset);
	}
	//marit_time
	private static void initializeInputVariable16() {
		byte[] lInput = {109, 97, 114, 105, 116, 95, 116, 105, 109, 101};
		mInputVariables[16] = new String(lInput, sCharset);
		mCategories[16] = new String[3];
		byte[] lCategory37_0 = {52};
		mCategories[16][0] = new String(lCategory37_0, sCharset);
		byte[] lCategory37_1 = {53};
		mCategories[16][1] = new String(lCategory37_1, sCharset);
		byte[] lCategory37_2 = {54};
		mCategories[16][2] = new String(lCategory37_2, sCharset);
	}
	private static void initializeOutputVariable0() {
		byte[] lOutput = {114, 114, 95, 99, 108, 97, 115, 115, 95, 105, 110, 116};
		mOutputVariables[0] = new String(lOutput, sCharset);
	}

	private double Kxen_RobustRegression_0_KxVar1( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(0);
		if (iInput.isEmpty(0, mMissingStrings[0]))
		{
			return (double)-0.034602724097272046;
		}
		if ( lValue > 90 ) {
			lValue = (double)90;
		}
		else if ( lValue < 17 ) {
			lValue = (double)17;
		}
		return (double)(0.074072864666681351 * lValue + -2.8493715814311633);
	}

	private double Kxen_RobustRegression_0_KxVar2( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(1);
		if (iInput.isEmpty(1, mMissingStrings[1]))
		{
			return (double)0.0;
		}
		if ( lValue > 9.0 ) {
			lValue = (double)9.0;
		}
		else if ( lValue < 1.7 ) {
			lValue = (double)1.7;
		}
		return (double)(0.74072864666681004 * lValue + -2.8493715814311411);
	}

	private double Kxen_RobustRegression_0_KxVar3( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(2);
		if (iInput.isEmpty(2, mMissingStrings[2]))
		{
			return (double)-1.2801123722748859e-006;
		}
		if ( lValue > 1226583 ) {
			lValue = (double)1226583;
		}
		else if ( lValue < 19302 ) {
			lValue = (double)19302;
		}
		return (double)(9.4771883181164897e-006 * lValue + -1.8043442096219346);
	}

	private double Kxen_RobustRegression_0_KxVar4( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(3);
		if (iInput.isEmpty(3, mMissingStrings[3]))
		{
			return (double)0.0;
		}
		if ( lValue > 1226.5830000000001 ) {
			lValue = (double)1226.5830000000001;
		}
		else if ( lValue < 19.302 ) {
			lValue = (double)19.302;
		}
		return (double)(0.0094771883181165029 * lValue + -1.8043442096219369);
	}

	private double Kxen_RobustRegression_0_KxVar5( IKxJModelInput iInput ) {
		String lValue = iInput.stringValue(4);
		if (iInput.isEmpty(4, mMissingStrings[4]))
		{
			return (double)-0.22173320723460466;
		}
		if ( 0 == strcmp( mCategories[4][0], lValue) ) {
			return (double)-0.07822625123572341;
		}
		if ( 0 == strcmp( mCategories[4][1], lValue) ) {
			return (double)-0.07822625123572341;
		}
		if ( 0 == strcmp( mCategories[4][2], lValue) ) {
			return (double)0.18199482409282206;
		}
		if ( 0 == strcmp( mCategories[4][4], lValue) ) {
			return (double)0.33075078675258501;
		}
		if ( 0 == strcmp( mCategories[4][5], lValue) ) {
			return (double)0.019298535990692939;
		}
		if ( 0 == strcmp( mCategories[4][6], lValue) ) {
			return (double)0.019298535990692939;
		}
		if ( 0 == strcmp( mCategories[4][8], lValue) ) {
			return (double)0.48676856491699799;
		}
		if ( 0 == strcmp( mCategories[4][10], lValue) ) {
			return (double)0.48676856491699799;
		}
		return (double)-0.22173320723460466;
	}

	private double Kxen_RobustRegression_0_KxVar6( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(5);
		if ( lValue > 16 ) {
			lValue = (double)16;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if (iInput.isEmpty(5, mMissingStrings[5]))
		{
			return (double)8.0;
		}
		if ( 0 == doublecmp( 10.0, lValue) ) {
			return (double)9.0;
		}
		if ( 0 == doublecmp( 13.0, lValue) ) {
			return (double)12.0;
		}
		if ( 0 == doublecmp( 14.0, lValue) ) {
			return (double)13.0;
		}
		if ( 0 == doublecmp( 11.0, lValue) ) {
			return (double)10.0;
		}
		if ( 0 == doublecmp( 7.0, lValue) ) {
			return (double)6.0;
		}
		if ( 0 == doublecmp( 12.0, lValue) ) {
			return (double)11.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)5.0;
		}
		if ( 0 == doublecmp( 4.0, lValue) ) {
			return (double)3.0;
		}
		if ( 0 == doublecmp( 15.0, lValue) ) {
			return (double)14.0;
		}
		if ( 0 == doublecmp( 5.0, lValue) ) {
			return (double)4.0;
		}
		if ( 0 == doublecmp( 8.0, lValue) ) {
			return (double)7.0;
		}
		if ( 0 == doublecmp( 16.0, lValue) ) {
			return (double)15.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)2.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)1.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)0.0;
		}
		return (double)8.0;
	}

	private double Kxen_RobustRegression_0_KxVar7( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(6);
		if (iInput.isEmpty(6, mMissingStrings[6]))
		{
			return (double)0.0;
		}
		if ( lValue > 1.6000000000000001 ) {
			lValue = (double)1.6000000000000001;
		}
		else if ( lValue < 0.10000000000000001 ) {
			lValue = (double)0.10000000000000001;
		}
		return (double)(3.8961585674780994 * lValue + -3.9279241653173251);
	}

	private double Kxen_RobustRegression_0_KxVar8( IKxJModelInput iInput ) {
		String lValue = iInput.stringValue(7);
		if (iInput.isEmpty(7, mMissingStrings[7]))
		{
			return (double)-0.22173320723460466;
		}
		if ( 0 == strcmp( mCategories[7][0], lValue) ) {
			return (double)-0.07822625123572341;
		}
		if ( 0 == strcmp( mCategories[7][1], lValue) ) {
			return (double)-0.07822625123572341;
		}
		if ( 0 == strcmp( mCategories[7][2], lValue) ) {
			return (double)0.18199482409282206;
		}
		if ( 0 == strcmp( mCategories[7][4], lValue) ) {
			return (double)0.33075078675258501;
		}
		if ( 0 == strcmp( mCategories[7][5], lValue) ) {
			return (double)0.019298535990692939;
		}
		if ( 0 == strcmp( mCategories[7][6], lValue) ) {
			return (double)0.019298535990692939;
		}
		if ( 0 == strcmp( mCategories[7][8], lValue) ) {
			return (double)0.48676856491699799;
		}
		if ( 0 == strcmp( mCategories[7][10], lValue) ) {
			return (double)0.48676856491699799;
		}
		return (double)-0.22173320723460466;
	}

	private double Kxen_RobustRegression_0_KxVar9( IKxJModelInput iInput ) {
		String lValue = iInput.stringValue(8);
		if (iInput.isEmpty(8, mMissingStrings[8]))
		{
			return (double)-0.1750836765583626;
		}
		if ( 0 == strcmp( mCategories[8][0], lValue) ) {
			return (double)0.22620199674886807;
		}
		if ( 0 == strcmp( mCategories[8][1], lValue) ) {
			return (double)-0.24138979289141896;
		}
		return (double)-0.1750836765583626;
	}

	private double Kxen_RobustRegression_0_KxVar10( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(9);
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if (iInput.isEmpty(9, mMissingStrings[9]))
		{
			return (double)1.0;
		}
		if ( 0 == doublecmp( 0.0, lValue) ) {
			return (double)0.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)2.0;
		}
		if ( 0 == doublecmp( 4.0, lValue) ) {
			return (double)4.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)6.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)3.0;
		}
		if ( 0 == doublecmp( 5.0, lValue) ) {
			return (double)5.0;
		}
		return (double)1.0;
	}

	private double Kxen_RobustRegression_0_KxVar11( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(10);
		if (iInput.isEmpty(10, mMissingStrings[10]))
		{
			return (double)0.0;
		}
		if ( lValue > 2.0 ) {
			lValue = (double)2.0;
		}
		else if ( lValue < 0.0 ) {
			lValue = (double)0.0;
		}
		return (double)(2.4038045193297748 * lValue + -0.87179623944600859);
	}

	private double Kxen_RobustRegression_0_KxVar12( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfYear(iInput.dateValue(11));
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)1.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)0.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)2.0;
		}
		return (double)1.0;
	}

	private double Kxen_RobustRegression_0_KxVar13( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)-0.01906827820636536;
		}
		if ( lValue > 31 ) {
			lValue = (double)31;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		return (double)(0.1100070090594558 * lValue + -1.7791804231576582);
	}

	private double Kxen_RobustRegression_0_KxVar14( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(11));
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)4.0;
		}
		if ( 0 == doublecmp( 5.0, lValue) ) {
			return (double)5.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)6.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)2.0;
		}
		if ( 0 == doublecmp( 0.0, lValue) ) {
			return (double)0.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)3.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)1.0;
		}
		return (double)4.0;
	}

	private double Kxen_RobustRegression_0_KxVar15( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)-0.029766080740309415;
		}
		if ( lValue > 89 ) {
			lValue = (double)89;
		}
		else if ( lValue < 17 ) {
			lValue = (double)17;
		}
		return (double)(0.074880929644637606 * lValue + -2.8752414072365382);
	}

	private double Kxen_RobustRegression_0_KxVar16( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfQuarter(iInput.dateValue(11));
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)1.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)0.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)2.0;
		}
		return (double)1.0;
	}

	private double Kxen_RobustRegression_0_KxVar17( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)-0.29169295012593988;
		}
		if ( lValue > 9 ) {
			lValue = (double)9;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		return (double)(0.7244328606888879 * lValue + -2.4649915321926033);
	}

	private double Kxen_RobustRegression_0_KxVar18( IKxJModelInput iInput ) {
		double lValue = DateUtils.getHour(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)-0.037199130569162749;
		}
		if ( lValue > 21 ) {
			lValue = (double)21;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		return (double)(0.14465024694509832 * lValue + -1.4837016000201459);
	}

	private double Kxen_RobustRegression_0_KxVar19( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMinute(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)-0.0013375903325974919;
		}
		if ( lValue > 48 ) {
			lValue = (double)48;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		return (double)(0.058885822023292199 * lValue + -1.4145973188916103);
	}

	private double Kxen_RobustRegression_0_KxVar20( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(12));
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)3.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)2.0;
		}
		if ( 0 == doublecmp( 4.0, lValue) ) {
			return (double)4.0;
		}
		if ( 0 == doublecmp( 5.0, lValue) ) {
			return (double)5.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)6.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)1.0;
		}
		if ( 0 == doublecmp( 0.0, lValue) ) {
			return (double)0.0;
		}
		return (double)3.0;
	}

	private double Kxen_RobustRegression_0_KxVar21( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)-0.29169295012593988;
		}
		if ( lValue > 9 ) {
			lValue = (double)9;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		return (double)(0.7244328606888879 * lValue + -2.4649915321926033);
	}

	private double Kxen_RobustRegression_0_KxVar22( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfYear(iInput.dateValue(13));
		if ( lValue > 7 ) {
			lValue = (double)7;
		}
		else if ( lValue < 6 ) {
			lValue = (double)6;
		}
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)1.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)0.0;
		}
		return (double)1.0;
	}

	private double Kxen_RobustRegression_0_KxVar23( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)-0.11487627719912473;
		}
		if ( lValue > 30 ) {
			lValue = (double)30;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		return (double)(0.11678693418071763 * lValue + -0.69881094810271294);
	}

	private double Kxen_RobustRegression_0_KxVar24( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(13));
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)6.0;
		}
		if ( 0 == doublecmp( 0.0, lValue) ) {
			return (double)0.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)3.0;
		}
		if ( 0 == doublecmp( 4.0, lValue) ) {
			return (double)4.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)1.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)2.0;
		}
		if ( 0 == doublecmp( 5.0, lValue) ) {
			return (double)5.0;
		}
		return (double)6.0;
	}

	private double Kxen_RobustRegression_0_KxVar25( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)-0.031765597839240808;
		}
		if ( lValue > 189 ) {
			lValue = (double)189;
		}
		else if ( lValue < 174 ) {
			lValue = (double)174;
		}
		return (double)(0.38961585674780763 * lValue + -71.331467382688032);
	}

	private double Kxen_RobustRegression_0_KxVar26( IKxJModelInput iInput ) {
		double lValue = DateUtils.getQuarter(iInput.dateValue(13));
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 2 ) {
			lValue = (double)2;
		}
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)1.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)0.0;
		}
		return (double)1.0;
	}

	private double Kxen_RobustRegression_0_KxVar27( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfQuarter(iInput.dateValue(13));
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)0.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)1.0;
		}
		return (double)0.0;
	}

	private double Kxen_RobustRegression_0_KxVar28( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)-1.1092330999225659;
		}
		if ( lValue > 31 ) {
			lValue = (double)31;
		}
		else if ( lValue < 30 ) {
			lValue = (double)30;
		}
		return (double)(2.0107568644674592 * lValue + -61.43193903394635);
	}

	private double Kxen_RobustRegression_0_KxVar29( IKxJModelInput iInput ) {
		double lValue = DateUtils.getHour(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)-0.07043554506951917;
		}
		if ( lValue > 21 ) {
			lValue = (double)21;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		return (double)(0.11959166467726307 * lValue + -1.2663521918421496);
	}

	private double Kxen_RobustRegression_0_KxVar30( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMinute(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)-0.0016382426276910669;
		}
		if ( lValue > 48 ) {
			lValue = (double)48;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		return (double)(0.060582212371937623 * lValue + -1.3344469148103189);
	}

	private double Kxen_RobustRegression_0_KxVar31( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(14));
		if ( lValue > 1 ) {
			lValue = (double)1;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)1.0;
		}
		if ( 0 == doublecmp( 0.0, lValue) ) {
			return (double)0.0;
		}
		return (double)1.0;
	}

	private double Kxen_RobustRegression_0_KxVar32( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)-1.1092330999231557;
		}
		if ( lValue > 244 ) {
			lValue = (double)244;
		}
		else if ( lValue < 243 ) {
			lValue = (double)243;
		}
		return (double)(2.0107568644674663 * lValue + -489.72315116551749);
	}

	private double Kxen_RobustRegression_0_KxVar33( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(15));
		if (iInput.isEmpty(15, mMissingStrings[15]))
		{
			return (double)-0.070528066619615346;
		}
		if ( lValue > 28 ) {
			lValue = (double)28;
		}
		else if ( lValue < 22 ) {
			lValue = (double)22;
		}
		return (double)(0.80126817314746601 * lValue + -18.499696049011334);
	}

	private double Kxen_RobustRegression_0_KxVar34( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(15));
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if (iInput.isEmpty(15, mMissingStrings[15]))
		{
			return (double)5.0;
		}
		if ( 0 == doublecmp( 4.0, lValue) ) {
			return (double)4.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)6.0;
		}
		if ( 0 == doublecmp( 1.0, lValue) ) {
			return (double)1.0;
		}
		if ( 0 == doublecmp( 3.0, lValue) ) {
			return (double)3.0;
		}
		if ( 0 == doublecmp( 0.0, lValue) ) {
			return (double)0.0;
		}
		if ( 0 == doublecmp( 2.0, lValue) ) {
			return (double)2.0;
		}
		return (double)5.0;
	}

	private double Kxen_RobustRegression_0_KxVar35( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(15));
		if (iInput.isEmpty(15, mMissingStrings[15]))
		{
			return (double)-0.070528066620372323;
		}
		if ( lValue > 179 ) {
			lValue = (double)179;
		}
		else if ( lValue < 173 ) {
			lValue = (double)173;
		}
		return (double)(0.80126817314746324 * lValue + -139.49119019427897);
	}

	private double Kxen_RobustRegression_0_KxVar36( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)-0.27161164101928581;
		}
		if ( lValue > 20 ) {
			lValue = (double)20;
		}
		else if ( lValue < 18 ) {
			lValue = (double)18;
		}
		return (double)(2.5492889555561415 * lValue + -46.158812841029835);
	}

	private double Kxen_RobustRegression_0_KxVar37( IKxJModelInput iInput ) {
		double lValue = DateUtils.getHour(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)-0.027199824289703581;
		}
		if ( lValue > 16 ) {
			lValue = (double)16;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		return (double)(0.18489880555757432 * lValue + -1.1365926576351495);
	}

	private double Kxen_RobustRegression_0_KxVar38( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(16));
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 4 ) {
			lValue = (double)4;
		}
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)0.0;
		}
		if ( 0 == doublecmp( 5.0, lValue) ) {
			return (double)1.0;
		}
		if ( 0 == doublecmp( 6.0, lValue) ) {
			return (double)2.0;
		}
		return (double)0.0;
	}

	private double Kxen_RobustRegression_0_KxVar39( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)-0.27161164101698415;
		}
		if ( lValue > 324 ) {
			lValue = (double)324;
		}
		else if ( lValue < 322 ) {
			lValue = (double)322;
		}
		return (double)(2.5492889555562153 * lValue + -821.14265533011826);
	}

	private double Kxen_RobustRegression_0_KxVar40( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(0);
		if (iInput.isEmpty(0, mMissingStrings[0]))
		{
			return (double)0.096987561695710378;
		}
		if ( lValue > 90 ) {
			lValue = (double)90;
		}
		else if ( lValue < 17 ) {
			lValue = (double)17;
		}
		if( 0 == doublesegcmp( lValue, 17.0, 1, 21.995000064373016, 1) ) { 
			return (double)(-0.29232894308545987);
		}
		if( 0 == doublesegcmp( lValue, 21.995000064373016, 0, 22.0, 1) ) { 
			return (double)(2.3752490026487414 * lValue + -52.535930909246517);
		}
		if( 0 == doublesegcmp( lValue, 22.0, 0, 23.577620573965202, 1) ) { 
			return (double)(0.0075278506805052485 * lValue + -0.44606556594527214);
		}
		if( 0 == doublesegcmp( lValue, 23.577620573965202, 0, 24.0, 1) ) { 
			return (double)(0.10501965984058605 * lValue + -2.7446904513910835);
		}
		if( 0 == doublesegcmp( lValue, 24.0, 0, 26.829963103267573, 1) ) { 
			return (double)(0.015674460064379954 * lValue + -0.60040565676213653);
		}
		if( 0 == doublesegcmp( lValue, 26.829963103267573, 0, 29.0, 1) ) { 
			return (double)(0.026657529591236351 * lValue + -0.89508100692831571);
		}
		if( 0 == doublesegcmp( lValue, 29.0, 0, 29.935183100064688, 1) ) { 
			return (double)(0.061857215752421313 * lValue + -1.9158719056026796);
		}
		if( 0 == doublesegcmp( lValue, 29.935183100064688, 0, 31.0, 1) ) { 
			return (double)(0.047712678474082511 * lValue + -1.492452592309917);
		}
		if( 0 == doublesegcmp( lValue, 31.0, 0, 32.615786479577288, 1) ) { 
			return (double)(0.031443057001983458 * lValue + -0.98809432667484653);
		}
		if( 0 == doublesegcmp( lValue, 32.615786479577288, 0, 35.0, 1) ) { 
			return (double)(0.014441170969602372 * lValue + -0.43356444209259737);
		}
		if( 0 == doublesegcmp( lValue, 35.0, 0, 39.113433298896219, 1) ) { 
			return (double)(0.008370339950741627 * lValue + -0.2210853564324714);
		}
		if( 0 == doublesegcmp( lValue, 39.113433298896219, 0, 43.0, 1) ) { 
			return (double)(0.0093760467608675728 * lValue + -0.26042200266857812);
		}
		if( 0 == doublesegcmp( lValue, 43.0, 0, 48.128169014084499, 1) ) { 
			return (double)(0.014211946224352538 * lValue + -0.46836567959843195);
		}
		if( 0 == doublesegcmp( lValue, 48.128169014084499, 0, 51.201581466360636, 1) ) { 
			return (double)(-0.011856733092166779 * lValue + 0.78627212452097883);
		}
		if( 0 == doublesegcmp( lValue, 51.201581466360636, 0, 53.0, 1) ) { 
			return (double)(-0.034627823682849591 * lValue + 1.9521879744777026);
		}
		if( 0 == doublesegcmp( lValue, 53.0, 0, 53.037000001757406, 1) ) { 
			return (double)(-1.6831166738624614 * lValue + 89.322097033997139);
		}
		if( 0 == doublesegcmp( lValue, 53.037000001757406, 0, 90.0, 1) ) { 
			return (double)(0.054637999395841588);
		}
		if( lValue > 90.0 ) {
			return (double)(0.054637999395841588);
		}
		return (double)0.096987561695710378;
	}

	private double Kxen_RobustRegression_0_KxVar41( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(1);
		if (iInput.isEmpty(1, mMissingStrings[1]))
		{
			return (double)0.10089771914971385;
		}
		if ( lValue > 9.0 ) {
			lValue = (double)9.0;
		}
		else if ( lValue < 1.7 ) {
			lValue = (double)1.7;
		}
		if( 0 == doublesegcmp( lValue, 1.7, 1, 2.1995000064373018, 1) ) { 
			return (double)(-0.29232894308545987);
		}
		if( 0 == doublesegcmp( lValue, 2.1995000064373018, 0, 2.2000000000000002, 1) ) { 
			return (double)(23.752490026487415 * lValue + -52.535930909246382);
		}
		if( 0 == doublesegcmp( lValue, 2.2000000000000002, 0, 2.3577620573965201, 1) ) { 
			return (double)(0.075278506805052617 * lValue + -0.44606556594527286);
		}
		if( 0 == doublesegcmp( lValue, 2.3577620573965201, 0, 2.3999999999999999, 1) ) { 
			return (double)(1.0501965984058605 * lValue + -2.744690451391083);
		}
		if( 0 == doublesegcmp( lValue, 2.3999999999999999, 0, 2.6829963103267573, 1) ) { 
			return (double)(0.1567446006437995 * lValue + -0.6004056567621362);
		}
		if( 0 == doublesegcmp( lValue, 2.6829963103267573, 0, 2.8999999999999999, 1) ) { 
			return (double)(0.26657529591236362 * lValue + -0.89508100692831594);
		}
		if( 0 == doublesegcmp( lValue, 2.8999999999999999, 0, 2.9935183100064688, 1) ) { 
			return (double)(0.61857215752420958 * lValue + -1.9158719056026694);
		}
		if( 0 == doublesegcmp( lValue, 2.9935183100064688, 0, 3.1000000000000001, 1) ) { 
			return (double)(0.47712678474082509 * lValue + -1.492452592309917);
		}
		if( 0 == doublesegcmp( lValue, 3.1000000000000001, 0, 3.2615786479577289, 1) ) { 
			return (double)(0.31443057001983526 * lValue + -0.98809432667484876);
		}
		if( 0 == doublesegcmp( lValue, 3.2615786479577289, 0, 3.5, 1) ) { 
			return (double)(0.14441170969602354 * lValue + -0.43356444209259692);
		}
		if( 0 == doublesegcmp( lValue, 3.5, 0, 3.9113433298896214, 1) ) { 
			return (double)(0.083703399507416357 * lValue + -0.22108535643247179);
		}
		if( 0 == doublesegcmp( lValue, 3.9113433298896214, 0, 4.2999999999999998, 1) ) { 
			return (double)(0.093760467608675666 * lValue + -0.26042200266857796);
		}
		if( 0 == doublesegcmp( lValue, 4.2999999999999998, 0, 4.8128169014084499, 1) ) { 
			return (double)(0.14211946224352531 * lValue + -0.46836567959843167);
		}
		if( 0 == doublesegcmp( lValue, 4.8128169014084499, 0, 5.1201581466360642, 1) ) { 
			return (double)(-0.11856733092166759 * lValue + 0.78627212452097761);
		}
		if( 0 == doublesegcmp( lValue, 5.1201581466360642, 0, 5.2999999999999998, 1) ) { 
			return (double)(-0.34627823682849729 * lValue + 1.9521879744777106);
		}
		if( 0 == doublesegcmp( lValue, 5.2999999999999998, 0, 5.3037000001757404, 1) ) { 
			return (double)(-16.831166738624614 * lValue + 89.322097033997139);
		}
		if( 0 == doublesegcmp( lValue, 5.3037000001757404, 0, 9.0, 1) ) { 
			return (double)(0.054637999395841588);
		}
		if( lValue > 9.0 ) {
			return (double)(0.054637999395841588);
		}
		return (double)0.10089771914971385;
	}

	private double Kxen_RobustRegression_0_KxVar42( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(2);
		if (iInput.isEmpty(2, mMissingStrings[2]))
		{
			return (double)0.023313602587660548;
		}
		if ( lValue > 1226583 ) {
			lValue = (double)1226583;
		}
		else if ( lValue < 19302 ) {
			lValue = (double)19302;
		}
		if( 0 == doublesegcmp( lValue, 19302.0, 1, 118610.59327983856, 1) ) { 
			return (double)(-0.015556071259849322);
		}
		if( 0 == doublesegcmp( lValue, 118610.59327983856, 0, 118710.0, 1) ) { 
			return (double)(0.00025285023536000128 * lValue + -30.006272498256411);
		}
		if( 0 == doublesegcmp( lValue, 118710.0, 0, 138789.54347524658, 1) ) { 
			return (double)(1.2517721142500391e-006 * lValue + -0.13901892635328647);
		}
		if( 0 == doublesegcmp( lValue, 138789.54347524658, 0, 162567.55980317941, 1) ) { 
			return (double)(8.9265100803628021e-007 * lValue + -0.089176671969553339);
		}
		if( 0 == doublesegcmp( lValue, 162567.55980317941, 0, 198766.0, 1) ) { 
			return (double)(-1.1727284451387319e-006 * lValue + 0.24658702580073344);
		}
		if( 0 == doublesegcmp( lValue, 198766.0, 0, 215728.22350322368, 1) ) { 
			return (double)(-1.251337729407848e-006 * lValue + 0.26221187879776853);
		}
		if( 0 == doublesegcmp( lValue, 215728.22350322368, 0, 245487.0, 1) ) { 
			return (double)(-4.0654624938215485e-007 * lValue + 0.079966513581166659);
		}
		if( 0 == doublesegcmp( lValue, 245487.0, 0, 246468.09604659956, 1) ) { 
			return (double)(-1.2331431782747802e-005 * lValue + 3.0073708885104988);
		}
		if( 0 == doublesegcmp( lValue, 246468.09604659956, 0, 1226583.0, 1) ) { 
			return (double)(-0.031933624511876625);
		}
		if( lValue > 1226583.0 ) {
			return (double)(-0.031933624511876625);
		}
		return (double)0.023313602587660548;
	}

	private double Kxen_RobustRegression_0_KxVar43( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(3);
		if (iInput.isEmpty(3, mMissingStrings[3]))
		{
			return (double)0.023313444183697102;
		}
		if ( lValue > 1226.5830000000001 ) {
			lValue = (double)1226.5830000000001;
		}
		else if ( lValue < 19.302 ) {
			lValue = (double)19.302;
		}
		if( 0 == doublesegcmp( lValue, 19.302, 1, 118.61059327983855, 1) ) { 
			return (double)(-0.015556071259849322);
		}
		if( 0 == doublesegcmp( lValue, 118.61059327983855, 0, 118.70999999999999, 1) ) { 
			return (double)(0.25285023535999634 * lValue + -30.006272498255832);
		}
		if( 0 == doublesegcmp( lValue, 118.70999999999999, 0, 138.78954347524657, 1) ) { 
			return (double)(0.0012517721142500378 * lValue + -0.13901892635328633);
		}
		if( 0 == doublesegcmp( lValue, 138.78954347524657, 0, 162.56755980317939, 1) ) { 
			return (double)(0.00089265100803628112 * lValue + -0.089176671969553478);
		}
		if( 0 == doublesegcmp( lValue, 162.56755980317939, 0, 198.76599999999999, 1) ) { 
			return (double)(-0.0011727284451387326 * lValue + 0.24658702580073355);
		}
		if( 0 == doublesegcmp( lValue, 198.76599999999999, 0, 215.72822350322366, 1) ) { 
			return (double)(-0.0012513377294078537 * lValue + 0.26221187879776975);
		}
		if( 0 == doublesegcmp( lValue, 215.72822350322366, 0, 245.48699999999999, 1) ) { 
			return (double)(-0.00040654624938215559 * lValue + 0.079966513581166854);
		}
		if( 0 == doublesegcmp( lValue, 245.48699999999999, 0, 246.46809604659956, 1) ) { 
			return (double)(-0.01233143178274824 * lValue + 3.0073708885106063);
		}
		if( 0 == doublesegcmp( lValue, 246.46809604659956, 0, 1226.5830000000001, 1) ) { 
			return (double)(-0.031933624511876625);
		}
		if( lValue > 1226.5830000000001 ) {
			return (double)(-0.031933624511876625);
		}
		return (double)0.023313444183697102;
	}

	private double Kxen_RobustRegression_0_KxVar44( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(5);
		if (iInput.isEmpty(5, mMissingStrings[5]))
		{
			return (double)-0.07822625123572341;
		}
		if ( lValue > 16 ) {
			lValue = (double)16;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 8.0, 1) ) { 
			return (double)(-0.22173320723460466);
		}
		if( 0 == doublesegcmp( lValue, 9.0, 1, 10.0, 1) ) { 
			return (double)(-0.07822625123572341);
		}
		if( 0 == doublesegcmp( lValue, 11.0, 1, 12.0, 1) ) { 
			return (double)(0.019298535990692939);
		}
		if( 0 == doublesegcmp( lValue, 13.0, 1, 13.0, 1) ) { 
			return (double)0.18199482409282206;
		}
		if( 0 == doublesegcmp( lValue, 14.0, 1, 14.0, 1) ) { 
			return (double)0.33075078675258501;
		}
		if( 0 == doublesegcmp( lValue, 15.0, 1, 16.0, 1) ) { 
			return (double)(0.48676856491699799);
		}
		if( lValue > 16.0 ) {
			return (double)(0.48676856491699799);
		}
		return (double)-0.07822625123572341;
	}

	private double Kxen_RobustRegression_0_KxVar45( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(6);
		if (iInput.isEmpty(6, mMissingStrings[6]))
		{
			return (double)-0.026284493623084271;
		}
		if ( lValue > 1.6000000000000001 ) {
			lValue = (double)1.6000000000000001;
		}
		else if ( lValue < 0.10000000000000001 ) {
			lValue = (double)0.10000000000000001;
		}
		if( 0 == doublesegcmp( lValue, 0.10000000000000001, 1, 0.79930000901222231, 1) ) { 
			return (double)(-0.22173320723460466);
		}
		if( 0 == doublesegcmp( lValue, 0.79930000901222231, 0, 0.80000000000000004, 1) ) { 
			return (double)(102.50628829841521 * lValue + -82.155010367967336);
		}
		if( 0 == doublesegcmp( lValue, 0.80000000000000004, 0, 0.88092277466977287, 1) ) { 
			return (double)(0.88669077762409954 * lValue + -0.85933235133444397);
		}
		if( 0 == doublesegcmp( lValue, 0.88092277466977287, 0, 1.0, 1) ) { 
			return (double)(0.4095022660964715 * lValue + -0.43896612371898669);
		}
		if( 0 == doublesegcmp( lValue, 1.0, 0, 1.1250446666525489, 1) ) { 
			return (double)(0.38995980331332436 * lValue + -0.41942366093583955);
		}
		if( 0 == doublesegcmp( lValue, 1.1250446666525489, 0, 1.2, 0) ) { 
			return (double)(1.0852882699351096 * lValue + -1.201699243880374);
		}
		if( 0 == doublesegcmp( lValue, 1.2, 1, 1.3, 1) ) { 
			return (double)(0.81348144051064419 * lValue + -0.87553104857101549);
		}
		if( 0 == doublesegcmp( lValue, 1.3, 0, 1.3999999999999999, 1) ) { 
			return (double)(0.74377981329881593 * lValue + -0.71054095186575728);
		}
		if( 0 == doublesegcmp( lValue, 1.3999999999999999, 0, 1.4002000000094994, 1) ) { 
			return (double)(390.04442688537426 * lValue + -545.65343796368927);
		}
		if( 0 == doublesegcmp( lValue, 1.4002000000094994, 0, 1.6000000000000001, 1) ) { 
			return (double)(0.48676856491699799);
		}
		if( lValue > 1.6000000000000001 ) {
			return (double)(0.48676856491699799);
		}
		return (double)-0.026284493623084271;
	}

	private double Kxen_RobustRegression_0_KxVar46( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(9);
		if (iInput.isEmpty(9, mMissingStrings[9]))
		{
			return (double)0.22620199674886807;
		}
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.24138979289141896;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)0.22620199674886807;
		}
		if( 0 == doublesegcmp( lValue, 2.0, 1, 6.0, 1) ) { 
			return (double)(-0.1750836765583626);
		}
		if( lValue > 6.0 ) {
			return (double)(-0.1750836765583626);
		}
		return (double)0.22620199674886807;
	}

	private double Kxen_RobustRegression_0_KxVar47( IKxJModelInput iInput ) {
		double lValue = iInput.doubleValue(10);
		if (iInput.isEmpty(10, mMissingStrings[10]))
		{
			return (double)-0.1750836765583626;
		}
		if ( lValue > 2.0 ) {
			lValue = (double)2.0;
		}
		else if ( lValue < 0.0 ) {
			lValue = (double)0.0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.24138979289141896;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 0, 0.33333333300000001, 1) ) { 
			return (double)(1.4027753703236363 * lValue + -0.24138979289141893);
		}
		if( 0 == doublesegcmp( lValue, 0.33333333300000001, 0, 0.3349999997461624, 1) ) { 
			return (double)(-120.38569625007948 * lValue + 40.154124536659843);
		}
		if( 0 == doublesegcmp( lValue, 0.3349999997461624, 0, 2.0, 1) ) { 
			return (double)(-0.1750836765583626);
		}
		if( lValue > 2.0 ) {
			return (double)(-0.1750836765583626);
		}
		return (double)-0.1750836765583626;
	}

	private double Kxen_RobustRegression_0_KxVar48( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfYear(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)0.11981588050191692;
		}
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)-0.21081460312664202;
		}
		if( 0 == doublesegcmp( lValue, 2.0, 1, 2.0, 1) ) { 
			return (double)0.11981588050191692;
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 3.0, 1) ) { 
			return (double)-0.0018690351171650043;
		}
		if( lValue > 3.0 ) {
			return (double)-0.0018690351171650043;
		}
		return (double)0.11981588050191692;
	}

	private double Kxen_RobustRegression_0_KxVar49( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)0.039561739681110986;
		}
		if ( lValue > 31 ) {
			lValue = (double)31;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 4.9960000514984131, 1) ) { 
			return (double)(0.037255247176944235);
		}
		if( 0 == doublesegcmp( lValue, 4.9960000514984131, 0, 5.0, 1) ) { 
			return (double)(10.168063480386349 * lValue + -50.762390424472393);
		}
		if( 0 == doublesegcmp( lValue, 5.0, 0, 10.772075820619509, 1) ) { 
			return (double)(0.014092583516359039 * lValue + 0.0074640598775676222);
		}
		if( 0 == doublesegcmp( lValue, 10.772075820619509, 0, 14.223782188732043, 1) ) { 
			return (double)(-0.011783079423600764 * lValue + 0.28619866297560892);
		}
		if( 0 == doublesegcmp( lValue, 14.223782188732043, 0, 16.0, 1) ) { 
			return (double)(-0.044497340111824289 * lValue + 0.75151918147029961);
		}
		if( 0 == doublesegcmp( lValue, 16.0, 0, 17.103774024451063, 1) ) { 
			return (double)(-0.071606113488653297 * lValue + 1.1852595554995637);
		}
		if( 0 == doublesegcmp( lValue, 17.103774024451063, 0, 20.0, 1) ) { 
			return (double)(-0.010400292477966594 * lValue + 0.1384090239517794);
		}
		if( 0 == doublesegcmp( lValue, 20.0, 0, 20.011000000522472, 1) ) { 
			return (double)(-2.7383268906627363 * lValue + 54.69694098764716);
		}
		if( 0 == doublesegcmp( lValue, 20.011000000522472, 0, 31.0, 1) ) { 
			return (double)(-0.099718422835545537);
		}
		if( lValue > 31.0 ) {
			return (double)(-0.099718422835545537);
		}
		return (double)0.039561739681110986;
	}

	private double Kxen_RobustRegression_0_KxVar50( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)-0.011376622231122294;
		}
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 3.0, 1) ) { 
			return (double)(0.0091482033639501865);
		}
		if( 0 == doublesegcmp( lValue, 4.0, 1, 6.0, 1) ) { 
			return (double)(-0.011376622231122294);
		}
		if( lValue > 6.0 ) {
			return (double)(-0.011376622231122294);
		}
		return (double)-0.011376622231122294;
	}

	private double Kxen_RobustRegression_0_KxVar51( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)0.096987561695710378;
		}
		if ( lValue > 89 ) {
			lValue = (double)89;
		}
		else if ( lValue < 17 ) {
			lValue = (double)17;
		}
		if( 0 == doublesegcmp( lValue, 17.0, 1, 21.995000064373016, 1) ) { 
			return (double)(-0.29232894308545987);
		}
		if( 0 == doublesegcmp( lValue, 21.995000064373016, 0, 22.0, 1) ) { 
			return (double)(2.3752490026487414 * lValue + -52.535930909246517);
		}
		if( 0 == doublesegcmp( lValue, 22.0, 0, 23.577620573965202, 1) ) { 
			return (double)(0.0075278506805052485 * lValue + -0.44606556594527214);
		}
		if( 0 == doublesegcmp( lValue, 23.577620573965202, 0, 24.0, 1) ) { 
			return (double)(0.10501965984058605 * lValue + -2.7446904513910835);
		}
		if( 0 == doublesegcmp( lValue, 24.0, 0, 26.829963103267573, 1) ) { 
			return (double)(0.015674460064379954 * lValue + -0.60040565676213653);
		}
		if( 0 == doublesegcmp( lValue, 26.829963103267573, 0, 29.0, 1) ) { 
			return (double)(0.026657529591236351 * lValue + -0.89508100692831571);
		}
		if( 0 == doublesegcmp( lValue, 29.0, 0, 29.935183100064688, 1) ) { 
			return (double)(0.061857215752421313 * lValue + -1.9158719056026796);
		}
		if( 0 == doublesegcmp( lValue, 29.935183100064688, 0, 31.0, 1) ) { 
			return (double)(0.047712678474082511 * lValue + -1.492452592309917);
		}
		if( 0 == doublesegcmp( lValue, 31.0, 0, 32.615786479577288, 1) ) { 
			return (double)(0.031443057001983458 * lValue + -0.98809432667484653);
		}
		if( 0 == doublesegcmp( lValue, 32.615786479577288, 0, 35.0, 1) ) { 
			return (double)(0.014441170969602372 * lValue + -0.43356444209259737);
		}
		if( 0 == doublesegcmp( lValue, 35.0, 0, 39.113433298896219, 1) ) { 
			return (double)(0.008370339950741627 * lValue + -0.2210853564324714);
		}
		if( 0 == doublesegcmp( lValue, 39.113433298896219, 0, 43.0, 1) ) { 
			return (double)(0.0093760467608675728 * lValue + -0.26042200266857812);
		}
		if( 0 == doublesegcmp( lValue, 43.0, 0, 48.128169014084499, 1) ) { 
			return (double)(0.014211946224352538 * lValue + -0.46836567959843195);
		}
		if( 0 == doublesegcmp( lValue, 48.128169014084499, 0, 51.201581466360636, 1) ) { 
			return (double)(-0.011856733092166779 * lValue + 0.78627212452097883);
		}
		if( 0 == doublesegcmp( lValue, 51.201581466360636, 0, 53.0, 1) ) { 
			return (double)(-0.034627823682849591 * lValue + 1.9521879744777026);
		}
		if( 0 == doublesegcmp( lValue, 53.0, 0, 53.036000001709908, 1) ) { 
			return (double)(-1.7298699148030854 * lValue + 91.800018803850207);
		}
		if( 0 == doublesegcmp( lValue, 53.036000001709908, 0, 89.0, 1) ) { 
			return (double)(0.054637999395841588);
		}
		if( lValue > 89.0 ) {
			return (double)(0.054637999395841588);
		}
		return (double)0.096987561695710378;
	}

	private double Kxen_RobustRegression_0_KxVar52( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfQuarter(iInput.dateValue(11));
		if (iInput.isEmpty(11, mMissingStrings[11]))
		{
			return (double)0.11981588050191692;
		}
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)-0.21081460312664202;
		}
		if( 0 == doublesegcmp( lValue, 2.0, 1, 2.0, 1) ) { 
			return (double)0.11981588050191692;
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 3.0, 1) ) { 
			return (double)-0.0018690351171650043;
		}
		if( lValue > 3.0 ) {
			return (double)-0.0018690351171650043;
		}
		return (double)0.11981588050191692;
	}

	private double Kxen_RobustRegression_0_KxVar53( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)0.045212760177533451;
		}
		if ( lValue > 9 ) {
			lValue = (double)9;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)-0.29616285398332953;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 0, 2.0, 1) ) { 
			return (double)(0.067501716120851318 * lValue + -0.36366457010418085);
		}
		if( 0 == doublesegcmp( lValue, 2.0, 0, 3.0, 1) ) { 
			return (double)(0.1369369490200058 * lValue + -0.36559808688248396);
		}
		if( 0 == doublesegcmp( lValue, 3.0, 0, 4.3726450640542573, 1) ) { 
			return (double)(0.073922693999742092 * lValue + -0.12582051130152322);
		}
		if( 0 == doublesegcmp( lValue, 4.3726450640542573, 0, 4.7453915547409444, 1) ) { 
			return (double)(-0.13611076639971603 * lValue + 0.79258126260040263);
		}
		if( 0 == doublesegcmp( lValue, 4.7453915547409444, 0, 5.0, 1) ) { 
			return (double)(-0.29172523359131269 * lValue + 1.5310328410069174);
		}
		if( 0 == doublesegcmp( lValue, 5.0, 0, 5.0040000001899898, 1) ) { 
			return (double)(-18.568926159899625 * lValue + 92.917037472548486);
		}
		if( 0 == doublesegcmp( lValue, 5.0040000001899898, 0, 9.0, 1) ) { 
			return (double)(-0.0018690351171650043);
		}
		if( lValue > 9.0 ) {
			return (double)(-0.0018690351171650043);
		}
		return (double)0.045212760177533451;
	}

	private double Kxen_RobustRegression_0_KxVar54( IKxJModelInput iInput ) {
		double lValue = DateUtils.getHour(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)0.017150217143638402;
		}
		if ( lValue > 21 ) {
			lValue = (double)21;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 6.9930000901222229, 1) ) { 
			return (double)(-0.00732975071152698);
		}
		if( 0 == doublesegcmp( lValue, 6.9930000901222229, 0, 7.0, 1) ) { 
			return (double)(1.7207007652282642 * lValue + -12.040190357026155);
		}
		if( 0 == doublesegcmp( lValue, 7.0, 0, 12.811599297012302, 1) ) { 
			return (double)(0.0041450725239819963 * lValue + -0.024300508096181568);
		}
		if( 0 == doublesegcmp( lValue, 12.811599297012302, 0, 14.680403602138448, 1) ) { 
			return (double)(-0.0064451640282401695 * lValue + 0.11137735907146193);
		}
		if( 0 == doublesegcmp( lValue, 14.680403602138448, 0, 16.0, 1) ) { 
			return (double)(-0.012926453362338658 * lValue + 0.20652530235826289);
		}
		if( 0 == doublesegcmp( lValue, 16.0, 0, 16.005000000237487, 1) ) { 
			return (double)(-3.4115400967733467 * lValue + 54.584343596934389);
		}
		if( 0 == doublesegcmp( lValue, 16.005000000237487, 0, 21.0, 1) ) { 
			return (double)(-0.017355652733223065);
		}
		if( lValue > 21.0 ) {
			return (double)(-0.017355652733223065);
		}
		return (double)0.017150217143638402;
	}

	private double Kxen_RobustRegression_0_KxVar55( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMinute(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)0.0060660778668033379;
		}
		if ( lValue > 48 ) {
			lValue = (double)48;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 11.988000154495239, 1) ) { 
			return (double)(-0.0091399758795926694);
		}
		if( 0 == doublesegcmp( lValue, 11.988000154495239, 0, 12.0, 1) ) { 
			return (double)(0.63359373003443942 * lValue + -7.6046617094196671);
		}
		if( 0 == doublesegcmp( lValue, 12.0, 0, 12.036000001709908, 1) ) { 
			return (double)(0.21119518089093151 * lValue + -2.5358791196975723);
		}
		if( 0 == doublesegcmp( lValue, 12.036000001709908, 0, 48.0, 1) ) { 
			return (double)(0.0060660778668033379);
		}
		if( lValue > 48.0 ) {
			return (double)(0.0060660778668033379);
		}
		return (double)0.0060660778668033379;
	}

	private double Kxen_RobustRegression_0_KxVar56( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)0.045212760177533437;
		}
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.071425157895308497;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)-0.29260659311318815;
		}
		if( 0 == doublesegcmp( lValue, 2.0, 1, 2.0, 1) ) { 
			return (double)-0.22690945378714431;
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 3.0, 1) ) { 
			return (double)0.045212760177533437;
		}
		if( 0 == doublesegcmp( lValue, 4.0, 1, 6.0, 1) ) { 
			return (double)(0.12890401472239618);
		}
		if( lValue > 6.0 ) {
			return (double)(0.12890401472239618);
		}
		return (double)0.045212760177533437;
	}

	private double Kxen_RobustRegression_0_KxVar57( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(12));
		if (iInput.isEmpty(12, mMissingStrings[12]))
		{
			return (double)0.045212760177533451;
		}
		if ( lValue > 9 ) {
			lValue = (double)9;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)-0.29616285398332953;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 0, 2.0, 1) ) { 
			return (double)(0.067501716120851318 * lValue + -0.36366457010418085);
		}
		if( 0 == doublesegcmp( lValue, 2.0, 0, 3.0, 1) ) { 
			return (double)(0.1369369490200058 * lValue + -0.36559808688248396);
		}
		if( 0 == doublesegcmp( lValue, 3.0, 0, 4.3726450640542573, 1) ) { 
			return (double)(0.073922693999742092 * lValue + -0.12582051130152322);
		}
		if( 0 == doublesegcmp( lValue, 4.3726450640542573, 0, 4.7453915547409444, 1) ) { 
			return (double)(-0.13611076639971603 * lValue + 0.79258126260040263);
		}
		if( 0 == doublesegcmp( lValue, 4.7453915547409444, 0, 5.0, 1) ) { 
			return (double)(-0.29172523359131269 * lValue + 1.5310328410069174);
		}
		if( 0 == doublesegcmp( lValue, 5.0, 0, 5.0040000001899898, 1) ) { 
			return (double)(-18.568926159899625 * lValue + 92.917037472548486);
		}
		if( 0 == doublesegcmp( lValue, 5.0040000001899898, 0, 9.0, 1) ) { 
			return (double)(-0.0018690351171650043);
		}
		if( lValue > 9.0 ) {
			return (double)(-0.0018690351171650043);
		}
		return (double)0.045212760177533451;
	}

	private double Kxen_RobustRegression_0_KxVar58( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfYear(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)0.030945083036725617;
		}
		if ( lValue > 7 ) {
			lValue = (double)7;
		}
		else if ( lValue < 6 ) {
			lValue = (double)6;
		}
		if( 0 == doublesegcmp( lValue, 6.0, 1, 6.0, 1) ) { 
			return (double)-0.22173320723460466;
		}
		if( 0 == doublesegcmp( lValue, 7.0, 1, 7.0, 1) ) { 
			return (double)0.030945083036725617;
		}
		if( lValue > 7.0 ) {
			return (double)0.030945083036725617;
		}
		return (double)0.030945083036725617;
	}

	private double Kxen_RobustRegression_0_KxVar59( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)0.18199482409282206;
		}
		if ( lValue > 30 ) {
			lValue = (double)30;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.9990000128746033, 1) ) { 
			return (double)(-0.07822625123572341);
		}
		if( 0 == doublesegcmp( lValue, 1.9990000128746033, 0, 2.0, 1) ) { 
			return (double)(48.763021417757521 * lValue + -97.555506693137559);
		}
		if( 0 == doublesegcmp( lValue, 2.0, 0, 3.2504466665254905, 1) ) { 
			return (double)(0.038995980331332392 * lValue + -0.10745581828518001);
		}
		if( 0 == doublesegcmp( lValue, 3.2504466665254905, 0, 4.0, 0) ) { 
			return (double)(0.10852882699351107 * lValue + -0.33346862793228682);
		}
		if( 0 == doublesegcmp( lValue, 4.0, 1, 5.0, 1) ) { 
			return (double)(0.081348144051064553 * lValue + -0.22474589616250074);
		}
		if( 0 == doublesegcmp( lValue, 5.0, 0, 12.325817361894027, 1) ) { 
			return (double)(0.0053131677754489045 * lValue + 0.17489063358359722);
		}
		if( 0 == doublesegcmp( lValue, 12.325817361894027, 0, 24.897827689076191, 1) ) { 
			return (double)(-0.0015480140297006717 * lValue + 0.25946030740062137);
		}
		if( 0 == doublesegcmp( lValue, 24.897827689076191, 0, 26.0, 1) ) { 
			return (double)(-0.20141200736222867 * lValue + 5.2356395746445754);
		}
		if( 0 == doublesegcmp( lValue, 26.0, 0, 26.00400000018999, 1) ) { 
			return (double)(-55.49768176456525 * lValue + 1442.938653261923);
		}
		if( 0 == doublesegcmp( lValue, 26.00400000018999, 0, 30.0, 1) ) { 
			return (double)(-0.2230633543756004);
		}
		if( lValue > 30.0 ) {
			return (double)(-0.2230633543756004);
		}
		return (double)0.18199482409282206;
	}

	private double Kxen_RobustRegression_0_KxVar60( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)-0.061298907934455457;
		}
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 2.0, 1) ) { 
			return (double)(-0.070944941281662538);
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 4.0, 1) ) { 
			return (double)(0.12550445681652572);
		}
		if( 0 == doublesegcmp( lValue, 5.0, 1, 5.0, 1) ) { 
			return (double)0.21741412823468262;
		}
		if( 0 == doublesegcmp( lValue, 6.0, 1, 6.0, 1) ) { 
			return (double)-0.061298907934455457;
		}
		if( lValue > 6.0 ) {
			return (double)-0.061298907934455457;
		}
		return (double)-0.061298907934455457;
	}

	private double Kxen_RobustRegression_0_KxVar61( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)-0.029463857622515022;
		}
		if ( lValue > 189 ) {
			lValue = (double)189;
		}
		else if ( lValue < 174 ) {
			lValue = (double)174;
		}
		if( 0 == doublesegcmp( lValue, 174.0, 1, 180.99300009012222, 1) ) { 
			return (double)(-0.22173320723460466);
		}
		if( 0 == doublesegcmp( lValue, 180.99300009012222, 0, 181.0, 1) ) { 
			return (double)(10.250628829841848 * lValue + -1855.5137979306091);
		}
		if( 0 == doublesegcmp( lValue, 181.0, 0, 181.80922774669773, 1) ) { 
			return (double)(0.088669077762409287 * lValue + -16.199082804231246);
		}
		if( 0 == doublesegcmp( lValue, 181.80922774669773, 0, 183.0, 1) ) { 
			return (double)(0.040950226609647589 * lValue + -7.5233553271880256);
		}
		if( 0 == doublesegcmp( lValue, 183.0, 0, 184.25044666652551, 1) ) { 
			return (double)(0.038995980331332322 * lValue + -7.1657282582563298);
		}
		if( 0 == doublesegcmp( lValue, 184.25044666652551, 0, 185.0, 0) ) { 
			return (double)(0.10852882699351564 * lValue + -19.977186313758633);
		}
		if( 0 == doublesegcmp( lValue, 185.0, 1, 186.0, 1) ) { 
			return (double)(0.081348144051064608 * lValue + -14.948759969405199);
		}
		if( 0 == doublesegcmp( lValue, 186.0, 0, 187.0, 1) ) { 
			return (double)(0.074377981329881493 * lValue + -13.577931721935251);
		}
		if( 0 == doublesegcmp( lValue, 187.0, 0, 187.00200000009499, 1) ) { 
			return (double)(39.004442688594267 * lValue + -7293.4220230912961);
		}
		if( 0 == doublesegcmp( lValue, 187.00200000009499, 0, 189.0, 1) ) { 
			return (double)(0.48676856491699799);
		}
		if( lValue > 189.0 ) {
			return (double)(0.48676856491699799);
		}
		return (double)-0.029463857622515022;
	}

	private double Kxen_RobustRegression_0_KxVar62( IKxJModelInput iInput ) {
		double lValue = DateUtils.getQuarter(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)0.030945083036725617;
		}
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 2 ) {
			lValue = (double)2;
		}
		if( 0 == doublesegcmp( lValue, 2.0, 1, 2.0, 1) ) { 
			return (double)-0.22173320723460466;
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 3.0, 1) ) { 
			return (double)0.030945083036725617;
		}
		if( lValue > 3.0 ) {
			return (double)0.030945083036725617;
		}
		return (double)0.030945083036725617;
	}

	private double Kxen_RobustRegression_0_KxVar63( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMonthOfQuarter(iInput.dateValue(13));
		if (iInput.isEmpty(13, mMissingStrings[13]))
		{
			return (double)0.030945083036725617;
		}
		if ( lValue > 3 ) {
			lValue = (double)3;
		}
		else if ( lValue < 1 ) {
			lValue = (double)1;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)0.030945083036725617;
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 3.0, 1) ) { 
			return (double)-0.22173320723460466;
		}
		if( lValue > 3.0 ) {
			return (double)-0.22173320723460466;
		}
		return (double)0.030945083036725617;
	}

	private double Kxen_RobustRegression_0_KxVar64( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)-0.12122627954314766;
		}
		if ( lValue > 31 ) {
			lValue = (double)31;
		}
		else if ( lValue < 30 ) {
			lValue = (double)30;
		}
		if( 0 == doublesegcmp( lValue, 30.0, 1, 30.0, 1) ) { 
			return (double)-0.12122627954314766;
		}
		if( 0 == doublesegcmp( lValue, 30.0, 0, 31.0, 1) ) { 
			return (double)(0.092816140056678015);
		}
		if( lValue > 31.0 ) {
			return (double)(0.092816140056678015);
		}
		return (double)-0.12122627954314766;
	}

	private double Kxen_RobustRegression_0_KxVar65( IKxJModelInput iInput ) {
		double lValue = DateUtils.getHour(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)0.1774580913003852;
		}
		if ( lValue > 21 ) {
			lValue = (double)21;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.073447439159976202;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 0, 2.2576816495760466, 1) ) { 
			return (double)(0.03070685121094106 * lValue + -0.073447439159976202);
		}
		if( 0 == doublesegcmp( lValue, 2.2576816495760466, 0, 4.0, 1) ) { 
			return (double)(0.051559140539358346 * lValue + -0.12052527012839434);
		}
		if( 0 == doublesegcmp( lValue, 4.0, 0, 5.8700699806677079, 1) ) { 
			return (double)(0.048036938522341824 * lValue + -0.10643646206032829);
		}
		if( 0 == doublesegcmp( lValue, 5.8700699806677079, 0, 8.0990860990860991, 1) ) { 
			return (double)(0.033811514232623248 * lValue + -0.022932225974989968);
		}
		if( 0 == doublesegcmp( lValue, 8.0990860990860991, 0, 12.0, 0) ) { 
			return (double)(-0.038640386395092333 * lValue + 0.56386195525130867);
		}
		if( 0 == doublesegcmp( lValue, 12.0, 1, 14.0, 1) ) { 
			return (double)(-0.037683205106325002 * lValue + 0.55237577978610075);
		}
		if( 0 == doublesegcmp( lValue, 14.0, 0, 16.0, 1) ) { 
			return (double)(-0.069012281556903421 * lValue + 0.85295828698039178);
		}
		if( 0 == doublesegcmp( lValue, 16.0, 0, 16.005000000237487, 1) ) { 
			return (double)(16.591400647194579 * lValue + -265.63069156586715);
		}
		if( 0 == doublesegcmp( lValue, 16.005000000237487, 0, 21.0, 1) ) { 
			return (double)(-0.085324203577650748);
		}
		if( lValue > 21.0 ) {
			return (double)(-0.085324203577650748);
		}
		return (double)0.1774580913003852;
	}

	private double Kxen_RobustRegression_0_KxVar66( IKxJModelInput iInput ) {
		double lValue = DateUtils.getMinute(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)0.0033521156054467927;
		}
		if ( lValue > 48 ) {
			lValue = (double)48;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.039012918209476111;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 0, 12.0, 1) ) { 
			return (double)(0.015203582634117875 * lValue + -0.039012918209476111);
		}
		if( 0 == doublesegcmp( lValue, 12.0, 0, 25.646299646973734, 1) ) { 
			return (double)(-0.0059238849158548511 * lValue + 0.13367758375425351);
		}
		if( 0 == doublesegcmp( lValue, 25.646299646973734, 0, 36.0, 1) ) { 
			return (double)(-0.010290707538028979 * lValue + 0.24567042522771479);
		}
		if( 0 == doublesegcmp( lValue, 36.0, 0, 48.0, 1) ) { 
			return (double)(-0.12479504614132843);
		}
		if( lValue > 48.0 ) {
			return (double)(-0.12479504614132843);
		}
		return (double)0.0033521156054467927;
	}

	private double Kxen_RobustRegression_0_KxVar67( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)0.092816140056678015;
		}
		if ( lValue > 1 ) {
			lValue = (double)1;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.12122627954314766;
		}
		if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
			return (double)0.092816140056678015;
		}
		if( lValue > 1.0 ) {
			return (double)0.092816140056678015;
		}
		return (double)0.092816140056678015;
	}

	private double Kxen_RobustRegression_0_KxVar68( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(14));
		if (iInput.isEmpty(14, mMissingStrings[14]))
		{
			return (double)-0.12122627954314766;
		}
		if ( lValue > 244 ) {
			lValue = (double)244;
		}
		else if ( lValue < 243 ) {
			lValue = (double)243;
		}
		if( 0 == doublesegcmp( lValue, 243.0, 1, 243.0, 1) ) { 
			return (double)-0.12122627954314766;
		}
		if( 0 == doublesegcmp( lValue, 243.0, 0, 244.0, 1) ) { 
			return (double)(0.092816140056678015);
		}
		if( lValue > 244.0 ) {
			return (double)(0.092816140056678015);
		}
		return (double)-0.12122627954314766;
	}

	private double Kxen_RobustRegression_0_KxVar69( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(15));
		if (iInput.isEmpty(15, mMissingStrings[15]))
		{
			return (double)0.22620199674886798;
		}
		if ( lValue > 28 ) {
			lValue = (double)28;
		}
		else if ( lValue < 22 ) {
			lValue = (double)22;
		}
		if( 0 == doublesegcmp( lValue, 22.0, 1, 22.0, 1) ) { 
			return (double)-0.24138979289141896;
		}
		if( 0 == doublesegcmp( lValue, 22.0, 0, 23.0, 1) ) { 
			return (double)(0.46759178964028614 * lValue + -10.528409164977713);
		}
		if( 0 == doublesegcmp( lValue, 23.0, 0, 23.005000000237487, 1) ) { 
			return (double)(-40.128565424721089 * lValue + 922.98256392868029);
		}
		if( 0 == doublesegcmp( lValue, 23.005000000237487, 0, 28.0, 1) ) { 
			return (double)(-0.1750836765583626);
		}
		if( lValue > 28.0 ) {
			return (double)(-0.1750836765583626);
		}
		return (double)0.22620199674886798;
	}

	private double Kxen_RobustRegression_0_KxVar70( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(15));
		if (iInput.isEmpty(15, mMissingStrings[15]))
		{
			return (double)0.22620199674886807;
		}
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 2.0, 1) ) { 
			return (double)(-0.19983314779509176);
		}
		if( 0 == doublesegcmp( lValue, 3.0, 1, 4.0, 1) ) { 
			return (double)(-0.23821303337680366);
		}
		if( 0 == doublesegcmp( lValue, 5.0, 1, 5.0, 1) ) { 
			return (double)0.22620199674886807;
		}
		if( 0 == doublesegcmp( lValue, 6.0, 1, 6.0, 1) ) { 
			return (double)-0.16079106060861179;
		}
		if( lValue > 6.0 ) {
			return (double)-0.16079106060861179;
		}
		return (double)0.22620199674886807;
	}

	private double Kxen_RobustRegression_0_KxVar71( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(15));
		if (iInput.isEmpty(15, mMissingStrings[15]))
		{
			return (double)0.22620199674886976;
		}
		if ( lValue > 179 ) {
			lValue = (double)179;
		}
		else if ( lValue < 173 ) {
			lValue = (double)173;
		}
		if( 0 == doublesegcmp( lValue, 173.0, 1, 173.0, 1) ) { 
			return (double)-0.24138979289141896;
		}
		if( 0 == doublesegcmp( lValue, 173.0, 0, 174.0, 1) ) { 
			return (double)(0.46759178964028081 * lValue + -81.134769400659991);
		}
		if( 0 == doublesegcmp( lValue, 174.0, 0, 174.00500000023749, 1) ) { 
			return (double)(-40.128565424607402 * lValue + 6982.3959430417826);
		}
		if( 0 == doublesegcmp( lValue, 174.00500000023749, 0, 179.0, 1) ) { 
			return (double)(-0.1750836765583626);
		}
		if( lValue > 179.0 ) {
			return (double)(-0.1750836765583626);
		}
		return (double)0.22620199674886976;
	}

	private double Kxen_RobustRegression_0_KxVar72( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfMonth(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)0.015854829525213106;
		}
		if ( lValue > 20 ) {
			lValue = (double)20;
		}
		else if ( lValue < 18 ) {
			lValue = (double)18;
		}
		if( 0 == doublesegcmp( lValue, 18.0, 1, 18.0, 1) ) { 
			return (double)0.015854829525213106;
		}
		if( 0 == doublesegcmp( lValue, 18.0, 0, 18.002000000094995, 1) ) { 
			return (double)(-108.461272297262 * lValue + 1952.3187561802413);
		}
		if( 0 == doublesegcmp( lValue, 18.002000000094995, 0, 20.0, 1) ) { 
			return (double)(-0.20106772537270359);
		}
		if( lValue > 20.0 ) {
			return (double)(-0.20106772537270359);
		}
		return (double)0.015854829525213106;
	}

	private double Kxen_RobustRegression_0_KxVar73( IKxJModelInput iInput ) {
		double lValue = DateUtils.getHour(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)0.091084974503270133;
		}
		if ( lValue > 16 ) {
			lValue = (double)16;
		}
		else if ( lValue < 0 ) {
			lValue = (double)0;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
			return (double)-0.23718775828818078;
		}
		if( 0 == doublesegcmp( lValue, 0.0, 0, 8.0, 1) ) { 
			return (double)(0.054712122131908486 * lValue + -0.23718775828818078);
		}
		if( 0 == doublesegcmp( lValue, 8.0, 0, 16.0, 1) ) { 
			return (double)(-0.16022723295102173);
		}
		if( lValue > 16.0 ) {
			return (double)(-0.16022723295102173);
		}
		return (double)0.091084974503270133;
	}

	private double Kxen_RobustRegression_0_KxVar74( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfWeek(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)0.015854829525213106;
		}
		if ( lValue > 6 ) {
			lValue = (double)6;
		}
		else if ( lValue < 4 ) {
			lValue = (double)4;
		}
		if( 0 == doublesegcmp( lValue, 4.0, 1, 4.0, 1) ) { 
			return (double)0.015854829525213106;
		}
		if( 0 == doublesegcmp( lValue, 5.0, 1, 6.0, 1) ) { 
			return (double)(-0.20106772537270359);
		}
		if( lValue > 6.0 ) {
			return (double)(-0.20106772537270359);
		}
		return (double)0.015854829525213106;
	}

	private double Kxen_RobustRegression_0_KxVar75( IKxJModelInput iInput ) {
		double lValue = DateUtils.getDayOfYear(iInput.dateValue(16));
		if (iInput.isEmpty(16, mMissingStrings[16]))
		{
			return (double)0.015854829525213106;
		}
		if ( lValue > 324 ) {
			lValue = (double)324;
		}
		else if ( lValue < 322 ) {
			lValue = (double)322;
		}
		if( 0 == doublesegcmp( lValue, 322.0, 1, 322.0, 1) ) { 
			return (double)0.015854829525213106;
		}
		if( 0 == doublesegcmp( lValue, 322.0, 0, 322.00200000009499, 1) ) { 
			return (double)(-108.46127229862624 * lValue + 34924.54553498717);
		}
		if( 0 == doublesegcmp( lValue, 322.00200000009499, 0, 324.0, 1) ) { 
			return (double)(-0.20106772537270359);
		}
		if( lValue > 324.0 ) {
			return (double)(-0.20106772537270359);
		}
		return (double)0.015854829525213106;
	}

	private Vector Kxen_RobustRegressionclass_int_apply(IKxJModelInput iInput) {
		double[] lInputs = new double[75];
		double[] lAllInputs = new double[76];

		lAllInputs[0] = (double)1.0;
		double lScore = (double)0.0029249987670950522;

		lInputs[0] = Kxen_RobustRegression_0_KxVar1( iInput );
		lAllInputs[1] = lInputs[0];
		lScore += lAllInputs[1] * (double)0.00042319095633178123;

		lInputs[1] = Kxen_RobustRegression_0_KxVar2( iInput );
		lAllInputs[2] = lInputs[1];
		lScore += lAllInputs[2] * (double)0.00042318202533587709;

		lInputs[2] = Kxen_RobustRegression_0_KxVar3( iInput );
		lAllInputs[3] = lInputs[2];
		lScore += lAllInputs[3] * (double)0.00055347326939371455;

		lInputs[3] = Kxen_RobustRegression_0_KxVar4( iInput );
		lAllInputs[4] = lInputs[3];
		lScore += lAllInputs[4] * (double)0.00055347346902145109;

		lInputs[4] = Kxen_RobustRegression_0_KxVar5( iInput );
		lAllInputs[5] = lInputs[4];
		lScore += lAllInputs[5] * (double)0.088710280907121464;

		lInputs[5] = Kxen_RobustRegression_0_KxVar6( iInput );
		lAllInputs[6] = lInputs[5];
		lScore += lAllInputs[6] * (double)0.0050183245787211008;

		lInputs[6] = Kxen_RobustRegression_0_KxVar7( iInput );
		lAllInputs[7] = lInputs[6];
		lScore += lAllInputs[7] * (double)0.012880185837196304;

		lInputs[7] = Kxen_RobustRegression_0_KxVar8( iInput );
		lAllInputs[8] = lInputs[7];
		lScore += lAllInputs[8] * (double)0.088710284310264731;

		lInputs[8] = Kxen_RobustRegression_0_KxVar9( iInput );
		lAllInputs[9] = lInputs[8];
		lScore += lAllInputs[9] * (double)0.11245556402963339;

		lInputs[9] = Kxen_RobustRegression_0_KxVar10( iInput );
		lAllInputs[10] = lInputs[9];
		lScore += lAllInputs[10] * (double)-0.0032559511390416623;

		lInputs[10] = Kxen_RobustRegression_0_KxVar11( iInput );
		lAllInputs[11] = lInputs[10];
		lScore += lAllInputs[11] * (double)-0.004063495704763667;

		lInputs[11] = Kxen_RobustRegression_0_KxVar12( iInput );
		lAllInputs[12] = lInputs[11];
		lScore += lAllInputs[12] * (double)-0.0049272305752501586;

		lInputs[12] = Kxen_RobustRegression_0_KxVar13( iInput );
		lAllInputs[13] = lInputs[12];
		lScore += lAllInputs[13] * (double)-0.0019094336148436388;

		lInputs[13] = Kxen_RobustRegression_0_KxVar14( iInput );
		lAllInputs[14] = lInputs[13];
		lScore += lAllInputs[14] * (double)-0.0017554385223377915;

		lInputs[14] = Kxen_RobustRegression_0_KxVar15( iInput );
		lAllInputs[15] = lInputs[14];
		lScore += lAllInputs[15] * (double)0.0009995972351567585;

		lInputs[15] = Kxen_RobustRegression_0_KxVar16( iInput );
		lAllInputs[16] = lInputs[15];
		lScore += lAllInputs[16] * (double)-0.0049272318442257299;

		lInputs[16] = Kxen_RobustRegression_0_KxVar17( iInput );
		lAllInputs[17] = lInputs[16];
		lScore += lAllInputs[17] * (double)-0.00088627144660179623;

		lInputs[17] = Kxen_RobustRegression_0_KxVar18( iInput );
		lAllInputs[18] = lInputs[17];
		lScore += lAllInputs[18] * (double)0.0008260761423515158;

		lInputs[18] = Kxen_RobustRegression_0_KxVar19( iInput );
		lAllInputs[19] = lInputs[18];
		lScore += lAllInputs[19] * (double)0.0043216870883226594;

		lInputs[19] = Kxen_RobustRegression_0_KxVar20( iInput );
		lAllInputs[20] = lInputs[19];
		lScore += lAllInputs[20] * (double)0.0059666101031616422;

		lInputs[20] = Kxen_RobustRegression_0_KxVar21( iInput );
		lAllInputs[21] = lInputs[20];
		lScore += lAllInputs[21] * (double)-0.00088627139971111696;

		lInputs[21] = Kxen_RobustRegression_0_KxVar22( iInput );
		lAllInputs[22] = lInputs[21];
		lScore += lAllInputs[22] * (double)-0.0078602964971755309;

		lInputs[22] = Kxen_RobustRegression_0_KxVar23( iInput );
		lAllInputs[23] = lInputs[22];
		lScore += lAllInputs[23] * (double)-0.0013078038923504452;

		lInputs[23] = Kxen_RobustRegression_0_KxVar24( iInput );
		lAllInputs[24] = lInputs[23];
		lScore += lAllInputs[24] * (double)0.00089608834575120844;

		lInputs[24] = Kxen_RobustRegression_0_KxVar25( iInput );
		lAllInputs[25] = lInputs[24];
		lScore += lAllInputs[25] * (double)0.012880185778866517;

		lInputs[25] = Kxen_RobustRegression_0_KxVar26( iInput );
		lAllInputs[26] = lInputs[25];
		lScore += lAllInputs[26] * (double)-0.0078602955898602351;

		lInputs[26] = Kxen_RobustRegression_0_KxVar27( iInput );
		lAllInputs[27] = lInputs[26];
		lScore += lAllInputs[27] * (double)-0.019330690273034037;

		lInputs[27] = Kxen_RobustRegression_0_KxVar28( iInput );
		lAllInputs[28] = lInputs[27];
		lScore += lAllInputs[28] * (double)0.0019585789701179598;

		lInputs[28] = Kxen_RobustRegression_0_KxVar29( iInput );
		lAllInputs[29] = lInputs[28];
		lScore += lAllInputs[29] * (double)-0.0005934342065044508;

		lInputs[29] = Kxen_RobustRegression_0_KxVar30( iInput );
		lAllInputs[30] = lInputs[29];
		lScore += lAllInputs[30] * (double)-0.0051983873593502428;

		lInputs[30] = Kxen_RobustRegression_0_KxVar31( iInput );
		lAllInputs[31] = lInputs[30];
		lScore += lAllInputs[31] * (double)0.0039382265989536362;

		lInputs[31] = Kxen_RobustRegression_0_KxVar32( iInput );
		lAllInputs[32] = lInputs[31];
		lScore += lAllInputs[32] * (double)0.0019585792049833686;

		lInputs[32] = Kxen_RobustRegression_0_KxVar33( iInput );
		lAllInputs[33] = lInputs[32];
		lScore += lAllInputs[33] * (double)-0.0040634957052060961;

		lInputs[33] = Kxen_RobustRegression_0_KxVar34( iInput );
		lAllInputs[34] = lInputs[33];
		lScore += lAllInputs[34] * (double)0.00252829018339978;

		lInputs[34] = Kxen_RobustRegression_0_KxVar35( iInput );
		lAllInputs[35] = lInputs[34];
		lScore += lAllInputs[35] * (double)-0.0040634957783224441;

		lInputs[35] = Kxen_RobustRegression_0_KxVar36( iInput );
		lAllInputs[36] = lInputs[35];
		lScore += lAllInputs[36] * (double)-0.00061768483029942683;

		lInputs[36] = Kxen_RobustRegression_0_KxVar37( iInput );
		lAllInputs[37] = lInputs[36];
		lScore += lAllInputs[37] * (double)-0.01047544613751125;

		lInputs[37] = Kxen_RobustRegression_0_KxVar38( iInput );
		lAllInputs[38] = lInputs[37];
		lScore += lAllInputs[38] * (double)-0.0015746569537323143;

		lInputs[38] = Kxen_RobustRegression_0_KxVar39( iInput );
		lAllInputs[39] = lInputs[38];
		lScore += lAllInputs[39] * (double)-0.00061768465065786186;

		lInputs[39] = Kxen_RobustRegression_0_KxVar40( iInput );
		lAllInputs[40] = lInputs[39];
		lScore += lAllInputs[40] * (double)0.054833118807286904;

		lInputs[40] = Kxen_RobustRegression_0_KxVar41( iInput );
		lAllInputs[41] = lInputs[40];
		lScore += lAllInputs[41] * (double)0.054833104947529063;

		lInputs[41] = Kxen_RobustRegression_0_KxVar42( iInput );
		lAllInputs[42] = lInputs[41];
		lScore += lAllInputs[42] * (double)0.15834611192505199;

		lInputs[42] = Kxen_RobustRegression_0_KxVar43( iInput );
		lAllInputs[43] = lInputs[42];
		lScore += lAllInputs[43] * (double)0.15834615760776685;

		lInputs[43] = Kxen_RobustRegression_0_KxVar44( iInput );
		lAllInputs[44] = lInputs[43];
		lScore += lAllInputs[44] * (double)0.088710288979969465;

		lInputs[44] = Kxen_RobustRegression_0_KxVar45( iInput );
		lAllInputs[45] = lInputs[44];
		lScore += lAllInputs[45] * (double)0.09243998629097723;

		lInputs[45] = Kxen_RobustRegression_0_KxVar46( iInput );
		lAllInputs[46] = lInputs[45];
		lScore += lAllInputs[46] * (double)0.11245554515441467;

		lInputs[46] = Kxen_RobustRegression_0_KxVar47( iInput );
		lAllInputs[47] = lInputs[46];
		lScore += lAllInputs[47] * (double)0.11245554936246489;

		lInputs[47] = Kxen_RobustRegression_0_KxVar48( iInput );
		lAllInputs[48] = lInputs[47];
		lScore += lAllInputs[48] * (double)0.11621100765003194;

		lInputs[48] = Kxen_RobustRegression_0_KxVar49( iInput );
		lAllInputs[49] = lInputs[48];
		lScore += lAllInputs[49] * (double)-0.072621459602416991;

		lInputs[49] = Kxen_RobustRegression_0_KxVar50( iInput );
		lAllInputs[50] = lInputs[49];
		lScore += lAllInputs[50] * (double)0.04529824477083827;

		lInputs[50] = Kxen_RobustRegression_0_KxVar51( iInput );
		lAllInputs[51] = lInputs[50];
		lScore += lAllInputs[51] * (double)0.054833104512504949;

		lInputs[51] = Kxen_RobustRegression_0_KxVar52( iInput );
		lAllInputs[52] = lInputs[51];
		lScore += lAllInputs[52] * (double)0.11621101308460524;

		lInputs[52] = Kxen_RobustRegression_0_KxVar53( iInput );
		lAllInputs[53] = lInputs[52];
		lScore += lAllInputs[53] * (double)0.031635504210913441;

		lInputs[53] = Kxen_RobustRegression_0_KxVar54( iInput );
		lAllInputs[54] = lInputs[53];
		lScore += lAllInputs[54] * (double)-0.58742627251718316;

		lInputs[54] = Kxen_RobustRegression_0_KxVar55( iInput );
		lAllInputs[55] = lInputs[54];
		lScore += lAllInputs[55] * (double)-0.79712967122194645;

		lInputs[55] = Kxen_RobustRegression_0_KxVar56( iInput );
		lAllInputs[56] = lInputs[55];
		lScore += lAllInputs[56] * (double)0.043207920990545587;

		lInputs[56] = Kxen_RobustRegression_0_KxVar57( iInput );
		lAllInputs[57] = lInputs[56];
		lScore += lAllInputs[57] * (double)0.031635502880979327;

		lInputs[57] = Kxen_RobustRegression_0_KxVar58( iInput );
		lAllInputs[58] = lInputs[57];
		lScore += lAllInputs[58] * (double)-0.031107927586041074;

		lInputs[58] = Kxen_RobustRegression_0_KxVar59( iInput );
		lAllInputs[59] = lInputs[58];
		lScore += lAllInputs[59] * (double)0.040359924832998932;

		lInputs[59] = Kxen_RobustRegression_0_KxVar60( iInput );
		lAllInputs[60] = lInputs[59];
		lScore += lAllInputs[60] * (double)0.12068493718230455;

		lInputs[60] = Kxen_RobustRegression_0_KxVar61( iInput );
		lAllInputs[61] = lInputs[60];
		lScore += lAllInputs[61] * (double)0.092439988907088308;

		lInputs[61] = Kxen_RobustRegression_0_KxVar62( iInput );
		lAllInputs[62] = lInputs[61];
		lScore += lAllInputs[62] * (double)-0.031107923492643793;

		lInputs[62] = Kxen_RobustRegression_0_KxVar63( iInput );
		lAllInputs[63] = lInputs[62];
		lScore += lAllInputs[63] * (double)-0.031107924314895192;

		lInputs[63] = Kxen_RobustRegression_0_KxVar64( iInput );
		lAllInputs[64] = lInputs[63];
		lScore += lAllInputs[64] * (double)0.018399276902404796;

		lInputs[64] = Kxen_RobustRegression_0_KxVar65( iInput );
		lAllInputs[65] = lInputs[64];
		lScore += lAllInputs[65] * (double)0.00024859882307373622;

		lInputs[65] = Kxen_RobustRegression_0_KxVar66( iInput );
		lAllInputs[66] = lInputs[65];
		lScore += lAllInputs[66] * (double)-0.015804126964386638;

		lInputs[66] = Kxen_RobustRegression_0_KxVar67( iInput );
		lAllInputs[67] = lInputs[66];
		lScore += lAllInputs[67] * (double)0.018399279312141498;

		lInputs[67] = Kxen_RobustRegression_0_KxVar68( iInput );
		lAllInputs[68] = lInputs[67];
		lScore += lAllInputs[68] * (double)0.018399277364794932;

		lInputs[68] = Kxen_RobustRegression_0_KxVar69( iInput );
		lAllInputs[69] = lInputs[68];
		lScore += lAllInputs[69] * (double)0.11245553657543594;

		lInputs[69] = Kxen_RobustRegression_0_KxVar70( iInput );
		lAllInputs[70] = lInputs[69];
		lScore += lAllInputs[70] * (double)0.10801353256442077;

		lInputs[70] = Kxen_RobustRegression_0_KxVar71( iInput );
		lAllInputs[71] = lInputs[70];
		lScore += lAllInputs[71] * (double)0.11245554649063101;

		lInputs[71] = Kxen_RobustRegression_0_KxVar72( iInput );
		lAllInputs[72] = lInputs[71];
		lScore += lAllInputs[72] * (double)-0.0074416810871402277;

		lInputs[72] = Kxen_RobustRegression_0_KxVar73( iInput );
		lAllInputs[73] = lInputs[72];
		lScore += lAllInputs[73] * (double)0.092820525009164989;

		lInputs[73] = Kxen_RobustRegression_0_KxVar74( iInput );
		lAllInputs[74] = lInputs[73];
		lScore += lAllInputs[74] * (double)-0.007441681477207778;

		lInputs[74] = Kxen_RobustRegression_0_KxVar75( iInput );
		lAllInputs[75] = lInputs[74];
		lScore += lAllInputs[75] * (double)-0.0074416811753816479;

		Vector lResults = new Vector(mOutputVariables.length);
		lResults.add( new Double(lScore) );
		return lResults;
	}

	public Object[] apply(IKxJModelInput iInput) {
		Vector lResults = Kxen_RobustRegressionclass_int_apply( iInput);
		return lResults.toArray();
	}
}
