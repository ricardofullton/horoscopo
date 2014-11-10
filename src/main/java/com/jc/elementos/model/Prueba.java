package com.jc.elementos.model;

// SAP InfiniteInsight - SAP II 6.5 SP5 - Temporary License File - Evaluation 6.5.5 - Copyright 2014 SAP AG or an SAP affiliate company. All rights reserved. - Model built in 6.5.5 - Model Name is quality_winequality-red - Model Version is 1 
//	Code compilation needs KxJRT.jar in the classpath as shown below:
//		javac -classpath "path-to-KxJRT.jar" model.java
//	where "model.java" is the generated java code.
//	This generates a file named "model.class" that contains java bytecode.

//	This runtime is available in the product directory in EXE/KCG/KxJavaRT.
//	In addition, in this directory, a small HOW TO is available (index.html).
//	Please refer to this file to compile and execute exported model in JAVA code.


import KxJRT.*;
import java.util.*;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.charset.Charset;

public class Prueba implements IKxJModel {


	private static Charset sCharset;
	private static String[] mInputVariables = new String[11];
	private static String[] mOutputVariables = new String[1];
	private static String[][] mCategories = new String[11][0];
	private static String[] mMissingStrings = new String[11];
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

	public Prueba() {}
	//fixed acidity
	private static void initializeInputVariable0() {
		byte[] lInput = {102, 105, 120, 101, 100, 32, 97, 99, 105, 100, 105, 116, 121};
		mInputVariables[0] = new String(lInput, sCharset);
	}
	//volatile acidity
	private static void initializeInputVariable1() {
		byte[] lInput = {118, 111, 108, 97, 116, 105, 108, 101, 32, 97, 99, 105, 100, 105, 116, 121};
		mInputVariables[1] = new String(lInput, sCharset);
	}
	//citric acid
	private static void initializeInputVariable2() {
		byte[] lInput = {99, 105, 116, 114, 105, 99, 32, 97, 99, 105, 100};
		mInputVariables[2] = new String(lInput, sCharset);
	}
	//residual sugar
	private static void initializeInputVariable3() {
		byte[] lInput = {114, 101, 115, 105, 100, 117, 97, 108, 32, 115, 117, 103, 97, 114};
		mInputVariables[3] = new String(lInput, sCharset);
	}
	//chlorides
	private static void initializeInputVariable4() {
		byte[] lInput = {99, 104, 108, 111, 114, 105, 100, 101, 115};
		mInputVariables[4] = new String(lInput, sCharset);
	}
	//free sulfur dioxide
	private static void initializeInputVariable5() {
		byte[] lInput = {102, 114, 101, 101, 32, 115, 117, 108, 102, 117, 114, 32, 100, 105, 111, 120, 105, 100, 101};
		mInputVariables[5] = new String(lInput, sCharset);
	}
	//total sulfur dioxide
	private static void initializeInputVariable6() {
		byte[] lInput = {116, 111, 116, 97, 108, 32, 115, 117, 108, 102, 117, 114, 32, 100, 105, 111, 120, 105, 100, 101};
		mInputVariables[6] = new String(lInput, sCharset);
	}
	//density
	private static void initializeInputVariable7() {
		byte[] lInput = {100, 101, 110, 115, 105, 116, 121};
		mInputVariables[7] = new String(lInput, sCharset);
	}
	//pH
	private static void initializeInputVariable8() {
		byte[] lInput = {112, 72};
		mInputVariables[8] = new String(lInput, sCharset);
	}
	//sulphates
	private static void initializeInputVariable9() {
		byte[] lInput = {115, 117, 108, 112, 104, 97, 116, 101, 115};
		mInputVariables[9] = new String(lInput, sCharset);
	}
	//alcohol
	private static void initializeInputVariable10() {
		byte[] lInput = {97, 108, 99, 111, 104, 111, 108};
		mInputVariables[10] = new String(lInput, sCharset);
	}
	private static void initializeOutputVariable0() {
		byte[] lOutput = {114, 114, 95, 113, 117, 97, 108, 105, 116, 121};
		mOutputVariables[0] = new String(lOutput, sCharset);
	}

	private double Kxen_RobustRegression_0_KxVar0( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(0);
	if (iInput.isEmpty(0, mMissingStrings[0]))
	{
		return (double)0.51351690207782941;
	}
	if ( lValue > 15.5 ) {
		lValue = (double)15.5;
	}
	else if ( lValue < 4.7000000000000002 ) {
		lValue = (double)4.7000000000000002;
	}
	if( 0 == doublesegcmp( lValue, 4.7000000000000002, 1, 4.7000000000000002, 1) ) { 
		return (double)0.43003955480542744;
	}
	if( 0 == doublesegcmp( lValue, 4.7000000000000002, 0, 7.4972000360488895, 1) ) { 
		return (double)(0.023243771656719165 * lValue + 0.320793828025349);
	}
	if( 0 == doublesegcmp( lValue, 7.4972000360488895, 0, 7.5, 1) ) { 
		return (double)(0.027087436770030275 * lValue + 0.29197710179919295);
	}
	if( 0 == doublesegcmp( lValue, 7.5, 0, 7.665405405405405, 1) ) { 
		return (double)(0.023308836784010568 * lValue + 0.32031660169481391);
	}
	if( 0 == doublesegcmp( lValue, 7.665405405405405, 0, 7.8308108108108101, 1) ) { 
		return (double)(0.023308836784010568 * lValue + 0.32031660169519788);
	}
	if( 0 == doublesegcmp( lValue, 7.8308108108108101, 0, 8.0465252302356784, 1) ) { 
		return (double)(0.023193881047708337 * lValue + 0.32121679831830097);
	}
	if( 0 == doublesegcmp( lValue, 8.0465252302356784, 0, 8.1999999999999993, 1) ) { 
		return (double)(0.023145211093351725 * lValue + 0.32160842233433717);
	}
	if( 0 == doublesegcmp( lValue, 8.1999999999999993, 0, 8.8149530110374066, 1) ) { 
		return (double)(0.023219173745173058 * lValue + 0.32100192859083382);
	}
	if( 0 == doublesegcmp( lValue, 8.8149530110374066, 0, 9.0, 1) ) { 
		return (double)(0.022972116436767148 * lValue + 0.3231797271558895);
	}
	if( 0 == doublesegcmp( lValue, 9.0, 0, 9.7453790014619628, 1) ) { 
		return (double)(0.023176330824082946 * lValue + 0.32134179767177579);
	}
	if( 0 == doublesegcmp( lValue, 9.7453790014619628, 0, 9.9000000000000004, 1) ) { 
		return (double)(0.021676514419688358 * lValue + 0.33595807696554342);
	}
	if( 0 == doublesegcmp( lValue, 9.9000000000000004, 0, 9.9056000002659861, 1) ) { 
		return (double)(-0.020029597529989788 * lValue + 0.74884858526720632);
	}
	if( 0 == doublesegcmp( lValue, 9.9056000002659861, 0, 15.5, 1) ) { 
		return (double)(0.023243771656719158 * lValue + 0.32019989945297728);
	}
	if( 0 == doublesegcmp( lValue, 15.5, 0, 15.5, 1) ) { 
		return (double)0.68047836013212426;
	}
	if( lValue > 15.5 ) {
		return (double)0.68047836013212426;
	}
	return (double)0.51351690207782941;
}

	private double Kxen_RobustRegression_0_KxVar1( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(1);
	if (iInput.isEmpty(1, mMissingStrings[1]))
	{
		return (double)0.5124477286836554;
	}
	if ( lValue > 1.5800000000000001 ) {
		lValue = (double)1.5800000000000001;
	}
	else if ( lValue < 0.12 ) {
		lValue = (double)0.12;
	}
	if( 0 == doublesegcmp( lValue, 0.12, 1, 0.12, 1) ) { 
		return (double)0.89933524192613057;
	}
	if( 0 == doublesegcmp( lValue, 0.12, 0, 0.30981000244617463, 1) ) { 
		return (double)(-0.7195631512725944 * lValue + 0.98568282006518393);
	}
	if( 0 == doublesegcmp( lValue, 0.30981000244617463, 0, 0.31, 1) ) { 
		return (double)(-128.57717716663251 * lValue + 40.597250530923375);
	}
	if( 0 == doublesegcmp( lValue, 0.31, 0, 0.35422943114367667, 1) ) { 
		return (double)(-1.2688045335991354 * lValue + 1.1316550146774875);
	}
	if( 0 == doublesegcmp( lValue, 0.35422943114367667, 0, 0.40999999999999998, 1) ) { 
		return (double)(-1.0650056849630949 * lValue + 1.0594634644514671);
	}
	if( 0 == doublesegcmp( lValue, 0.40999999999999998, 0, 0.45234616741747435, 1) ) { 
		return (double)(-1.1745164040937419 * lValue + 1.104362859290059);
	}
	if( 0 == doublesegcmp( lValue, 0.45234616741747435, 0, 0.54000000000000004, 1) ) { 
		return (double)(-0.82574570716706963 * lValue + 0.94659777122051914);
	}
	if( 0 == doublesegcmp( lValue, 0.54000000000000004, 0, 0.57392103236759495, 1) ) { 
		return (double)(-0.99394477612109144 * lValue + 1.0374252684523189);
	}
	if( 0 == doublesegcmp( lValue, 0.57392103236759495, 0, 0.58999999999999997, 1) ) { 
		return (double)(-1.9407351129804735 * lValue + 1.580808156015201);
	}
	if( 0 == doublesegcmp( lValue, 0.58999999999999997, 0, 0.62758176135762578, 1) ) { 
		return (double)(-1.2420289361796462 * lValue + 1.1685715116980426);
	}
	if( 0 == doublesegcmp( lValue, 0.62758176135762578, 0, 0.73999999999999999, 1) ) { 
		return (double)(-0.77795316302320139 * lValue + 0.87732602056837328);
	}
	if( 0 == doublesegcmp( lValue, 0.73999999999999999, 0, 0.74084000003989781, 1) ) { 
		return (double)(-8.5339702507157202 * lValue + 6.6167786654601297);
	}
	if( 0 == doublesegcmp( lValue, 0.74084000003989781, 0, 1.5800000000000001, 1) ) { 
		return (double)(-0.71956315127259418 * lValue + 0.82755330953651318);
	}
	if( 0 == doublesegcmp( lValue, 1.5800000000000001, 0, 1.5800000000000001, 1) ) { 
		return (double)-0.30935646947418571;
	}
	if( lValue > 1.5800000000000001 ) {
		return (double)-0.30935646947418571;
	}
	return (double)0.5124477286836554;
}

	private double Kxen_RobustRegression_0_KxVar2( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(2);
	if (iInput.isEmpty(2, mMissingStrings[2]))
	{
		return (double)0.48333680334766488;
	}
	if ( lValue > 1.0 ) {
		lValue = (double)1.0;
	}
	else if ( lValue < 0.0 ) {
		lValue = (double)0.0;
	}
	if( 0 == doublesegcmp( lValue, 0.0, 1, 0.0, 1) ) { 
		return (double)0.58323309128063117;
	}
	if( 0 == doublesegcmp( lValue, 0.0, 0, 0.11988000154495239, 1) ) { 
		return (double)(-0.3251125662726419 * lValue + 0.58323309127673362);
	}
	if( 0 == doublesegcmp( lValue, 0.11988000154495239, 0, 0.12, 1) ) { 
		return (double)(-51.333929256149148 * lValue + 6.6981701148646522);
	}
	if( 0 == doublesegcmp( lValue, 0.12, 0, 0.16941780821917807, 1) ) { 
		return (double)(-0.44897437676501578 * lValue + 0.59197552933639142);
	}
	if( 0 == doublesegcmp( lValue, 0.16941780821917807, 0, 0.21883561643835617, 1) ) { 
		return (double)(-0.4489743767650155 * lValue + 0.59197552933417263);
	}
	if( 0 == doublesegcmp( lValue, 0.21883561643835617, 0, 0.27653668643009865, 1) ) { 
		return (double)(-0.21903170507772332 * lValue + 0.54165588302873757);
	}
	if( 0 == doublesegcmp( lValue, 0.27653668643009865, 0, 0.28999999999999998, 1) ) { 
		return (double)(1.623389399458868 * lValue + 0.032158855773493547);
	}
	if( 0 == doublesegcmp( lValue, 0.28999999999999998, 0, 0.29835437828833689, 1) ) { 
		return (double)(2.8149526846431896 * lValue + -0.31339449692760918);
	}
	if( 0 == doublesegcmp( lValue, 0.29835437828833689, 0, 0.35999999999999999, 1) ) { 
		return (double)(-0.2674409036769102 * lValue + 0.60625112575394091);
	}
	if( 0 == doublesegcmp( lValue, 0.35999999999999999, 0, 0.36064000003039837, 1) ) { 
		return (double)(5.2298957571584168 * lValue + -1.3727900721464652);
	}
	if( 0 == doublesegcmp( lValue, 0.36064000003039837, 0, 1.0, 1) ) { 
		return (double)(-0.3251125662726424 * lValue + 0.63056812976381205);
	}
	if( 0 == doublesegcmp( lValue, 1.0, 0, 1.0, 1) ) { 
		return (double)0.30545556349116965;
	}
	if( lValue > 1.0 ) {
		return (double)0.30545556349116965;
	}
	return (double)0.48333680334766488;
}

	private double Kxen_RobustRegression_0_KxVar3( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(3);
	if (iInput.isEmpty(3, mMissingStrings[3]))
	{
		return (double)0.54224036040480084;
	}
	if ( lValue > 15.5 ) {
		lValue = (double)15.5;
	}
	else if ( lValue < 0.90000000000000002 ) {
		lValue = (double)0.90000000000000002;
	}
	if( 0 == doublesegcmp( lValue, 0.90000000000000002, 1, 0.90000000000000002, 1) ) { 
		return (double)0.42951093326247924;
	}
	if( 0 == doublesegcmp( lValue, 0.90000000000000002, 0, 1.6992000102996827, 1) ) { 
		return (double)(0.017033526674676072 * lValue + 0.41418075925663211);
	}
	if( 0 == doublesegcmp( lValue, 1.6992000102996827, 0, 1.7, 1) ) { 
		return (double)(27.269339656307857 * lValue + -45.892938096904082);
	}
	if( 0 == doublesegcmp( lValue, 1.7, 0, 2.1492541261756744, 1) ) { 
		return (double)(0.065561882772791888 * lValue + 0.35348411810856295);
	}
	if( 0 == doublesegcmp( lValue, 2.1492541261756744, 0, 2.2999999999999998, 1) ) { 
		return (double)(0.44804503053094458 * lValue + -0.46856936539655308);
	}
	if( 0 == doublesegcmp( lValue, 2.2999999999999998, 0, 2.3738721804511278, 1) ) { 
		return (double)(0.89656903490478701 * lValue + -1.5001745754497664);
	}
	if( 0 == doublesegcmp( lValue, 2.3738721804511278, 0, 2.4477443609022553, 1) ) { 
		return (double)(0.89656903490479845 * lValue + -1.5001745754431717);
	}
	if( 0 == doublesegcmp( lValue, 2.4477443609022553, 0, 2.4744098348779042, 1) ) { 
		return (double)(-2.4195706693161303 * lValue + 6.6168876855212249);
	}
	if( 0 == doublesegcmp( lValue, 2.4744098348779042, 0, 2.5, 1) ) { 
		return (double)(-2.6286471574118435 * lValue + 7.1342286039002722);
	}
	if( 0 == doublesegcmp( lValue, 2.5, 0, 2.5599667910117785, 1) ) { 
		return (double)(-1.1119814568487061 * lValue + 3.3425643524857578);
	}
	if( 0 == doublesegcmp( lValue, 2.5599667910117785, 0, 2.8307894736842107, 1) ) { 
		return (double)(-0.038320759221249494 * lValue + 0.59402862174389215);
	}
	if( 0 == doublesegcmp( lValue, 2.8307894736842107, 0, 3.1153947368421053, 1) ) { 
		return (double)(0.069707170293959786 * lValue + 0.28822429601032101);
	}
	if( 0 == doublesegcmp( lValue, 3.1153947368421053, 0, 3.3999999999999999, 1) ) { 
		return (double)(0.069707170293959786 * lValue + 0.28822429601230581);
	}
	if( 0 == doublesegcmp( lValue, 3.3999999999999999, 0, 3.4121000005747191, 1) ) { 
		return (double)(1.2559753028489171 * lValue + -3.7450873546730148);
	}
	if( 0 == doublesegcmp( lValue, 3.4121000005747191, 0, 15.5, 1) ) { 
		return (double)(0.017033526674676048 * lValue + 0.48230588054373108);
	}
	if( 0 == doublesegcmp( lValue, 15.5, 0, 15.5, 1) ) { 
		return (double)0.74632554400120976;
	}
	if( lValue > 15.5 ) {
		return (double)0.74632554400120976;
	}
	return (double)0.54224036040480084;
}

	private double Kxen_RobustRegression_0_KxVar4( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(4);
	if (iInput.isEmpty(4, mMissingStrings[4]))
	{
		return (double)0.52205931579308806;
	}
	if ( lValue > 0.61099999999999999 ) {
		lValue = (double)0.61099999999999999;
	}
	else if ( lValue < 0.012 ) {
		lValue = (double)0.012;
	}
	if( 0 == doublesegcmp( lValue, 0.012, 1, 0.012, 1) ) { 
		return (double)0.53960186447496916;
	}
	if( 0 == doublesegcmp( lValue, 0.012, 0, 0.065946000695228588, 1) ) { 
		return (double)(-0.95170785645124312 * lValue + 0.55102235874724992);
	}
	if( 0 == doublesegcmp( lValue, 0.065946000695228588, 0, 0.066000000000000003, 1) ) { 
		return (double)(381.41457662281238 * lValue + -24.664504903352114);
	}
	if( 0 == doublesegcmp( lValue, 0.066000000000000003, 0, 0.071190853659043596, 1) ) { 
		return (double)(3.0259641963781991 * lValue + 0.30914351679404201);
	}
	if( 0 == doublesegcmp( lValue, 0.071190853659043596, 0, 0.079000000000000001, 1) ) { 
		return (double)(0.80580868760341628 * lValue + 0.46719828272017683);
	}
	if( 0 == doublesegcmp( lValue, 0.079000000000000001, 0, 0.07952758249199994, 1) ) { 
		return (double)(25.062619944965334 * lValue + -1.4490898066100906);
	}
	if( 0 == doublesegcmp( lValue, 0.07952758249199994, 0, 0.080905172413793108, 1) ) { 
		return (double)(2.8638095962573158 * lValue + 0.31632791462143978);
	}
	if( 0 == doublesegcmp( lValue, 0.080905172413793108, 0, 0.081452586206896549, 1) ) { 
		return (double)(-10.553618614815878 * lValue + 1.4018672573874322);
	}
	if( 0 == doublesegcmp( lValue, 0.081452586206896549, 0, 0.082000000000000003, 1) ) { 
		return (double)(-10.553618614815814 * lValue + 1.4018672573868516);
	}
	if( 0 == doublesegcmp( lValue, 0.082000000000000003, 0, 0.084232611804897745, 1) ) { 
		return (double)(-3.3059990851128838 * lValue + 0.8075624559504726);
	}
	if( 0 == doublesegcmp( lValue, 0.084232611804897745, 0, 0.086546448087431699, 1) ) { 
		return (double)(-3.1436110247162268 * lValue + 0.79388408549660039);
	}
	if( 0 == doublesegcmp( lValue, 0.086546448087431699, 0, 0.088773224043715834, 1) ) { 
		return (double)(1.3258922156260315 * lValue + 0.40706445533000807);
	}
	if( 0 == doublesegcmp( lValue, 0.088773224043715834, 0, 0.090999999999999998, 1) ) { 
		return (double)(1.3258922156260151 * lValue + 0.40706445533030527);
	}
	if( 0 == doublesegcmp( lValue, 0.090999999999999998, 0, 0.091520000024698678, 1) ) { 
		return (double)(8.8015706774713287 * lValue + -0.27322228469715382);
	}
	if( 0 == doublesegcmp( lValue, 0.091520000024698678, 0, 0.61099999999999999, 1) ) { 
		return (double)(-0.95170785645124567 * lValue + 0.61939776691888593);
	}
	if( 0 == doublesegcmp( lValue, 0.61099999999999999, 0, 0.61099999999999999, 1) ) { 
		return (double)0.03790426662717479;
	}
	if( lValue > 0.61099999999999999 ) {
		return (double)0.03790426662717479;
	}
	return (double)0.52205931579308806;
}

	private double Kxen_RobustRegression_0_KxVar5( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(5);
	if (iInput.isEmpty(5, mMissingStrings[5]))
	{
		return (double)0.5313219273117733;
	}
	if ( lValue > 72 ) {
		lValue = (double)72;
	}
	else if ( lValue < 1 ) {
		lValue = (double)1;
	}
	if( 0 == doublesegcmp( lValue, 1.0, 1, 1.0, 1) ) { 
		return (double)0.50538085581883352;
	}
	if( 0 == doublesegcmp( lValue, 1.0, 0, 4.0, 1) ) { 
		return (double)(0.00018630838711127437 * lValue + 0.50519454743179659);
	}
	if( 0 == doublesegcmp( lValue, 5.0, 1, 6.0, 1) ) { 
		return (double)(0.012691073165775224 * lValue + 0.45517548831712196);
	}
	if( 0 == doublesegcmp( lValue, 6.0, 0, 10.0, 1) ) { 
		return (double)(-0.0019476814802185105 * lValue + 0.53431483141687053);
	}
	if( 0 == doublesegcmp( lValue, 11.0, 1, 18.0, 1) ) { 
		return (double)(-0.000377357694684975 * lValue + 0.51849589730593848);
	}
	if( 0 == doublesegcmp( lValue, 19.0, 1, 72.0, 1) ) { 
		return (double)(0.00018630838711124225 * lValue + 0.50388210822973034);
	}
	if( lValue > 72.0 ) {
		return (double)(0.00018630838711124225 * lValue + 0.50388210822973034);
	}
	return (double)0.5313219273117733;
}

	private double Kxen_RobustRegression_0_KxVar6( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(6);
	if (iInput.isEmpty(6, mMissingStrings[6]))
	{
		return (double)0.51672080172697488;
	}
	if ( lValue > 289 ) {
		lValue = (double)289;
	}
	else if ( lValue < 6 ) {
		lValue = (double)6;
	}
	if( 0 == doublesegcmp( lValue, 6.0, 1, 6.0, 1) ) { 
		return (double)0.51054478527579761;
	}
	if( 0 == doublesegcmp( lValue, 6.0, 0, 13.0, 1) ) { 
		return (double)(0.0013053028897464752 * lValue + 0.50271296793836184);
	}
	if( 0 == doublesegcmp( lValue, 14.0, 1, 14.0, 1) ) { 
		return (double)0.54535074929115979;
	}
	if( 0 == doublesegcmp( lValue, 14.0, 0, 15.0, 1) ) { 
		return (double)(0.023313805283541544 * lValue + 0.21895747532415832);
	}
	if( 0 == doublesegcmp( lValue, 16.0, 1, 16.0, 1) ) { 
		return (double)0.58679925813998479;
	}
	if( 0 == doublesegcmp( lValue, 17.0, 1, 17.0, 1) ) { 
		return (double)0.58485082991690396;
	}
	if( 0 == doublesegcmp( lValue, 18.0, 1, 19.0, 1) ) { 
		return (double)(-0.014759207151975318 * lValue + 0.83575735149856456);
	}
	if( 0 == doublesegcmp( lValue, 19.0, 0, 36.0, 1) ) { 
		return (double)(0.0001074777832819324 * lValue + 0.55329033772886316);
	}
	if( 0 == doublesegcmp( lValue, 37.0, 1, 48.0, 1) ) { 
		return (double)(-0.001433002959004332 * lValue + 0.60944901561255316);
	}
	if( 0 == doublesegcmp( lValue, 48.0, 0, 55.0, 1) ) { 
		return (double)(-0.0027186535761409519 * lValue + 0.67116024523297513);
	}
	if( 0 == doublesegcmp( lValue, 56.0, 1, 62.0, 1) ) { 
		return (double)(-0.0052743020051822893 * lValue + 0.81390901056757414);
	}
	if( 0 == doublesegcmp( lValue, 62.0, 0, 83.0, 1) ) { 
		return (double)(-0.00054304219189164958 * lValue + 0.52057090214236745);
	}
	if( 0 == doublesegcmp( lValue, 84.0, 1, 93.0, 1) ) { 
		return (double)(-0.0093014311253641416 * lValue + 1.2551397494672567);
	}
	if( 0 == doublesegcmp( lValue, 94.0, 1, 289.0, 1) ) { 
		return (double)(0.0013053028897464685 * lValue + 0.17187735604457521);
	}
	if( lValue > 289.0 ) {
		return (double)(0.0013053028897464685 * lValue + 0.17187735604457521);
	}
	return (double)0.51672080172697488;
}

	private double Kxen_RobustRegression_0_KxVar7( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(7);
	if (iInput.isEmpty(7, mMissingStrings[7]))
	{
		return (double)0.47256452233257407;
	}
	if ( lValue > 1.00369 ) {
		lValue = (double)1.00369;
	}
	else if ( lValue < 0.99007000000000001 ) {
		lValue = (double)0.99007000000000001;
	}
	if( 0 == doublesegcmp( lValue, 0.99007000000000001, 1, 0.99007000000000001, 1) ) { 
		return (double)0.81915762140573178;
	}
	if( 0 == doublesegcmp( lValue, 0.99007000000000001, 0, 0.99568438007235527, 1) ) { 
		return (double)(-33.673742066334093 * lValue + 34.158519429002226);
	}
	if( 0 == doublesegcmp( lValue, 0.99568438007235527, 0, 0.99568999999999996, 1) ) { 
		return (double)(-11062.391025326324 * lValue + 11015.280050604972);
	}
	if( 0 == doublesegcmp( lValue, 0.99568999999999996, 0, 0.99582108927045343, 1) ) { 
		return (double)(-506.48584125686517 * lValue + 504.87081787886461);
	}
	if( 0 == doublesegcmp( lValue, 0.99582108927045343, 0, 0.99637329639889205, 1) ) { 
		return (double)(-60.318934265210899 * lValue + 60.568402562003236);
	}
	if( 0 == doublesegcmp( lValue, 0.99637329639889205, 0, 0.99668664819944597, 1) ) { 
		return (double)(13.28199600452402 * lValue + -12.765598948877203);
	}
	if( 0 == doublesegcmp( lValue, 0.99668664819944597, 0, 0.997, 1) ) { 
		return (double)(13.281996004468295 * lValue + -12.765598948821305);
	}
	if( 0 == doublesegcmp( lValue, 0.997, 0, 0.99711641592920353, 1) ) { 
		return (double)(92.715019089436282 * lValue + -91.960322964533447);
	}
	if( 0 == doublesegcmp( lValue, 0.99711641592920353, 0, 0.99723283185840705, 1) ) { 
		return (double)(92.715019089314211 * lValue + -91.960322964410423);
	}
	if( 0 == doublesegcmp( lValue, 0.99723283185840705, 0, 0.99732098029072935, 1) ) { 
		return (double)(-200.59293374337338 * lValue + 200.53599744552079);
	}
	if( 0 == doublesegcmp( lValue, 0.99732098029072935, 0, 0.99739999999999995, 1) ) { 
		return (double)(-241.38718476937257 * lValue + 241.22095986899512);
	}
	if( 0 == doublesegcmp( lValue, 0.99739999999999995, 0, 0.99747027152571111, 1) ) { 
		return (double)(-267.24567163364424 * lValue + 267.01221466741748);
	}
	if( 0 == doublesegcmp( lValue, 0.99747027152571111, 0, 0.99760000000000004, 1) ) { 
		return (double)(-102.20817021417112 * lValue + 102.39221331460953);
	}
	if( 0 == doublesegcmp( lValue, 0.99760000000000004, 0, 0.9977769090909091, 1) ) { 
		return (double)(-83.930440318587841 * lValue + 84.158349970773941);
	}
	if( 0 == doublesegcmp( lValue, 0.9977769090909091, 0, 0.99795381818181816, 1) ) { 
		return (double)(-83.930440318507507 * lValue + 84.158349970692043);
	}
	if( 0 == doublesegcmp( lValue, 0.99795381818181816, 0, 0.99814292995979981, 1) ) { 
		return (double)(13.340076400073361 * lValue + -12.913133585133798);
	}
	if( 0 == doublesegcmp( lValue, 0.99814292995979981, 0, 0.99819999999999998, 1) ) { 
		return (double)(482.55992533730512 * lValue + -481.26160839863377);
	}
	if( 0 == doublesegcmp( lValue, 0.99819999999999998, 0, 0.99820549000026071, 1) ) { 
		return (double)(5332.7151017325468 * lValue + -5322.686505476363);
	}
	if( 0 == doublesegcmp( lValue, 0.99820549000026071, 0, 1.00369, 1) ) { 
		return (double)(-33.673742066335869 * lValue + 34.072299879816327);
	}
	if( 0 == doublesegcmp( lValue, 1.00369, 0, 1.00369, 1) ) { 
		return (double)0.27430170525568048;
	}
	if( lValue > 1.00369 ) {
		return (double)0.27430170525568048;
	}
	return (double)0.47256452233257407;
}

	private double Kxen_RobustRegression_0_KxVar8( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(8);
	if (iInput.isEmpty(8, mMissingStrings[8]))
	{
		return (double)0.54018936133760831;
	}
	if ( lValue > 4.0099999999999998 ) {
		lValue = (double)4.0099999999999998;
	}
	else if ( lValue < 2.7400000000000002 ) {
		lValue = (double)2.7400000000000002;
	}
	if( 0 == doublesegcmp( lValue, 2.7400000000000002, 1, 2.7400000000000002, 1) ) { 
		return (double)0.67698965178400816;
	}
	if( 0 == doublesegcmp( lValue, 2.7400000000000002, 0, 3.3593800079822538, 1) ) { 
		return (double)(-0.23935253458114686 * lValue + 1.3328155965215254);
	}
	if( 0 == doublesegcmp( lValue, 3.3593800079822538, 0, 3.3599999999999999, 1) ) { 
		return (double)(-63.193646334244491 * lValue + 212.82021160374808);
	}
	if( 0 == doublesegcmp( lValue, 3.3599999999999999, 0, 3.3606500000308732, 1) ) { 
		return (double)(-60.287287588029706 * lValue + 203.05484621646218);
	}
	if( 0 == doublesegcmp( lValue, 3.3606500000308732, 0, 4.0099999999999998, 1) ) { 
		return (double)(-0.23935253458114686 * lValue + 1.2547532772209327);
	}
	if( 0 == doublesegcmp( lValue, 4.0099999999999998, 0, 4.0099999999999998, 1) ) { 
		return (double)0.2949496135505339;
	}
	if( lValue > 4.0099999999999998 ) {
		return (double)0.2949496135505339;
	}
	return (double)0.54018936133760831;
}

	private double Kxen_RobustRegression_0_KxVar9( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(9);
	if (iInput.isEmpty(9, mMissingStrings[9]))
	{
		return (double)0.5784830711360458;
	}
	if ( lValue > 2.0 ) {
		lValue = (double)2.0;
	}
	else if ( lValue < 0.33000000000000002 ) {
		lValue = (double)0.33000000000000002;
	}
	if( 0 == doublesegcmp( lValue, 0.33000000000000002, 1, 0.33000000000000002, 1) ) { 
		return (double)0.16667632395299076;
	}
	if( 0 == doublesegcmp( lValue, 0.33000000000000002, 0, 0.5198100024461747, 1) ) { 
		return (double)(0.21297375379803518 * lValue + 0.096394985203681602);
	}
	if( 0 == doublesegcmp( lValue, 0.5198100024461747, 0, 0.52000000000000002, 1) ) { 
		return (double)(508.21287317544812 * lValue + -263.96703397581109);
	}
	if( 0 == doublesegcmp( lValue, 0.52000000000000002, 0, 0.58035928883551824, 1) ) { 
		return (double)(1.8120439233722161 * lValue + -0.63860276472071009);
	}
	if( 0 == doublesegcmp( lValue, 0.58035928883551824, 0, 0.64000000000000001, 1) ) { 
		return (double)(1.8508086618843265 * lValue + -0.66110024078445473);
	}
	if( 0 == doublesegcmp( lValue, 0.64000000000000001, 0, 0.68130717591153156, 1) ) { 
		return (double)(2.5777357239091687 * lValue + -1.1263335604697053);
	}
	if( 0 == doublesegcmp( lValue, 0.68130717591153156, 0, 0.72999999999999998, 1) ) { 
		return (double)(1.9147737320787008 * lValue + -0.67465279806968137);
	}
	if( 0 == doublesegcmp( lValue, 0.72999999999999998, 0, 0.77420258620689653, 1) ) { 
		return (double)(2.0876479320987453 * lValue + -0.80085096407508582);
	}
	if( 0 == doublesegcmp( lValue, 0.77420258620689653, 0, 0.81840517241379307, 1) ) { 
		return (double)(2.0876479320987453 * lValue + -0.80085096406585798);
	}
	if( 0 == doublesegcmp( lValue, 0.81840517241379307, 0, 0.91420822455053041, 1) ) { 
		return (double)(-0.65198247805466603 * lValue + 1.4412767340995687);
	}
	if( 0 == doublesegcmp( lValue, 0.91420822455053041, 0, 0.95999999999999996, 1) ) { 
		return (double)(-3.5730022560077139 * lValue + 4.1116970391626477);
	}
	if( 0 == doublesegcmp( lValue, 0.95999999999999996, 0, 0.96104000004939727, 1) ) { 
		return (double)(-166.48563688430144 * lValue + 160.50782628230724);
	}
	if( 0 == doublesegcmp( lValue, 0.96104000004939727, 0, 2.0, 1) ) { 
		return (double)(0.21297375379803518 * lValue + 0.30379350645583758);
	}
	if( 0 == doublesegcmp( lValue, 2.0, 0, 2.0, 1) ) { 
		return (double)0.72974101405190794;
	}
	if( lValue > 2.0 ) {
		return (double)0.72974101405190794;
	}
	return (double)0.5784830711360458;
}

	private double Kxen_RobustRegression_0_KxVar10( IKxJModelInput iInput ) {
	double lValue = iInput.doubleValue(10);
	if (iInput.isEmpty(10, mMissingStrings[10]))
	{
		return (double)0.53530707993379401;
	}
	if ( lValue > 14.0 ) {
		lValue = (double)14.0;
	}
	else if ( lValue < 8.4000000000000004 ) {
		lValue = (double)8.4000000000000004;
	}
	if( 0 == doublesegcmp( lValue, 8.4000000000000004, 1, 8.4000000000000004, 1) ) { 
		return (double)0.19249206572034899;
	}
	if( 0 == doublesegcmp( lValue, 8.4000000000000004, 0, 9.1992000102996823, 1) ) { 
		return (double)(0.11275986058312729 * lValue + -0.75469076316890871);
	}
	if( 0 == doublesegcmp( lValue, 9.1992000102996823, 0, 9.1999999999999993, 1) ) { 
		return (double)(-18.119831623527233 * lValue + 166.97056500524747);
	}
	if( 0 == doublesegcmp( lValue, 9.1999999999999993, 0, 9.3477053140096622, 1) ) { 
		return (double)(0.014009957811113501 * lValue + 0.13922245693501017);
	}
	if( 0 == doublesegcmp( lValue, 9.3477053140096622, 0, 9.4954106280193233, 1) ) { 
		return (double)(0.014009957811112918 * lValue + 0.13922245693522531);
	}
	if( 0 == doublesegcmp( lValue, 9.4954106280193233, 0, 9.7376883039785351, 1) ) { 
		return (double)(0.17296303588442741 * lValue + -1.3701022899543225);
	}
	if( 0 == doublesegcmp( lValue, 9.7376883039785351, 0, 9.8000000000000007, 1) ) { 
		return (double)(1.0228974503467705 * lValue + -9.646498696806745);
	}
	if( 0 == doublesegcmp( lValue, 9.8000000000000007, 0, 10.062853705067878, 1) ) { 
		return (double)(0.32851568116940838 * lValue + -2.8415573588599647);
	}
	if( 0 == doublesegcmp( lValue, 10.062853705067878, 0, 10.5, 1) ) { 
		return (double)(0.19076749769969689 * lValue + -1.4554175404570702);
	}
	if( 0 == doublesegcmp( lValue, 10.5, 0, 10.763865602697194, 1) ) { 
		return (double)(0.24199515761823123 * lValue + -1.9933079695952969);
	}
	if( 0 == doublesegcmp( lValue, 10.763865602697194, 0, 11.1, 1) ) { 
		return (double)(0.19239794235282984 * lValue + -1.459450210204005);
	}
	if( 0 == doublesegcmp( lValue, 11.1, 0, 11.469386604430317, 1) ) { 
		return (double)(0.18522891684274689 * lValue + -1.3798740270352443);
	}
	if( 0 == doublesegcmp( lValue, 11.469386604430317, 0, 11.699999999999999, 1) ) { 
		return (double)(0.29868830201955543 * lValue + -2.681183579522139);
	}
	if( 0 == doublesegcmp( lValue, 11.699999999999999, 0, 11.702300000109243, 1) ) { 
		return (double)(18.755189067563176 * lValue + -218.622242536378);
	}
	if( 0 == doublesegcmp( lValue, 11.702300000109243, 0, 14.0, 1) ) { 
		return (double)(0.11275986058312733 * lValue + -0.46294322547307659);
	}
	if( 0 == doublesegcmp( lValue, 14.0, 0, 14.0, 1) ) { 
		return (double)1.1156948226907053;
	}
	if( lValue > 14.0 ) {
		return (double)1.1156948226907053;
	}
	return (double)0.53530707993379401;
}

double	Extra_0_KxVar0(double iInput) {
	double lValue = iInput;
	if( lValue < 4.9114421449040382 ) {
		return (double)(0.58974482810506146 * lValue + 2.5580478510510649);
	}
	if( 0 == doublesegcmp( lValue, 4.9114421449040382, 1, 5.0655920188439172, 0) ) { 
		return (double)(0.58974482810506146 * lValue + 2.5580478510510649);
	}
	if( 0 == doublesegcmp( lValue, 5.0655920188439172, 1, 5.2279756948043943, 0) ) { 
		return (double)(1.1196826327692864 * lValue + -0.12640086273968903);
	}
	if( 0 == doublesegcmp( lValue, 5.2279756948043943, 1, 5.3804876512489095, 0) ) { 
		return (double)(0.59607845200100762 * lValue + 2.610989068014828);
	}
	if( 0 == doublesegcmp( lValue, 5.3804876512489095, 1, 5.5673459383960653, 0) ) { 
		return (double)(0.60814195276697414 * lValue + 2.5460815511126995);
	}
	if( 0 == doublesegcmp( lValue, 5.5673459383960653, 1, 5.8132909295686792, 0) ) { 
		return (double)(1.0164874625340072 * lValue + 0.27268083584898223);
	}
	if( 0 == doublesegcmp( lValue, 5.8132909295686792, 1, 5.9311538287404098, 0) ) { 
		return (double)(0.77131219024771103 * lValue + 1.697956022385388);
	}
	if( 0 == doublesegcmp( lValue, 5.9311538287404098, 1, 6.0548369731162444, 0) ) { 
		return (double)(1.837540017434514 * lValue + -4.6260052371431506);
	}
	if( 0 == doublesegcmp( lValue, 6.0548369731162444, 1, 6.2260930776185353, 0) ) { 
		return (double)(2.3887668721638815 * lValue + -7.9635939777330886);
	}
	if( 0 == doublesegcmp( lValue, 6.2260930776185353, 1, 6.3598626071525572, 0) ) { 
		return (double)(1.6989872661167109 * lValue + -3.6689619474403674);
	}
	if( 0 == doublesegcmp( lValue, 6.3598626071525572, 1, 6.6320352666586633, 0) ) { 
		return (double)(0.46125546103322151 * lValue + 4.2028422773935485);
	}
	if( lValue >= 6.6320352666586633 ) {
		return (double)(0.46125546103322151 * lValue + 4.2028422773935485);
	}
	return (double)7.2619047619047628;
}

private Vector Kxen_RobustRegressionquality_apply(IKxJModelInput iInput) {
	double[] lInputs = new double[22];
	double[] lAllInputs = new double[23];

	lAllInputs[0] = (double)1.0;
	double lScore = (double)0.0;

	lScore += Kxen_RobustRegression_0_KxVar0(iInput);
	lScore += Kxen_RobustRegression_0_KxVar1(iInput);
	lScore += Kxen_RobustRegression_0_KxVar2(iInput);
	lScore += Kxen_RobustRegression_0_KxVar3(iInput);
	lScore += Kxen_RobustRegression_0_KxVar4(iInput);
	lScore += Kxen_RobustRegression_0_KxVar5(iInput);
	lScore += Kxen_RobustRegression_0_KxVar6(iInput);
	lScore += Kxen_RobustRegression_0_KxVar7(iInput);
	lScore += Kxen_RobustRegression_0_KxVar8(iInput);
	lScore += Kxen_RobustRegression_0_KxVar9(iInput);
	lScore += Kxen_RobustRegression_0_KxVar10(iInput);
	double lZscore = Extra_0_KxVar0( lScore );

if (lScore < 0.0) lScore -= 0.5;
else lScore += 0.5;
	Vector lResults = new Vector(mOutputVariables.length);
	lResults.add( new Integer((int)(lZscore)) );
	return lResults;
}

public Object[] apply(IKxJModelInput iInput) {
	Vector lResults = Kxen_RobustRegressionquality_apply( iInput);
	return lResults.toArray();
}

}
