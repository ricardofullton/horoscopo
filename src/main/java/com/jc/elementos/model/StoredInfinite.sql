DELIMITER //

CREATE PROCEDURE InfiniteProcedure()
BEGIN
-- SAP InfiniteInsight - SAP II 6.5 SP5 - Temporary License File - Evaluation 6.5.5 - Copyright 2014 SAP AG or an SAP affiliate company. All rights reserved. - Model built in 6.5.5 - Model Name is B FIN_analysis2 - Model Version is 1
SELECT Id, `rr_B FIN`, (CASE 
WHEN `rr_B FIN` < -2.052791594659e0 THEN 0.0e0
WHEN `rr_B FIN` <= -5.537915717847e-1 THEN 0.0e0
WHEN `rr_B FIN` <= -5.527915846593e-1 THEN  ( 1.34495402461e-2*`rr_B FIN`+7.448242167167e-3 ) 
WHEN `rr_B FIN` <= -4.425210011379e-1 THEN  ( 1.219669530994e-4*`rr_B FIN`+8.087167358816e-5 ) 
WHEN `rr_B FIN` <= -4.424106201734e-1 THEN  ( 1.217231411601e2*`rr_B FIN`+5.386507440377e1 ) 
WHEN `rr_B FIN` <= -3.291852091578e-1 THEN  ( 1.186652148224e-1*`rr_B FIN`+6.596156892494e-2 ) 
WHEN `rr_B FIN` <= -2.869725923528e-1 THEN  ( 8.537420858173e-1*`rr_B FIN`+3.079380098012e-1 ) 
WHEN `rr_B FIN` <= -2.712631285589e-1 THEN  ( 2.294074959628e0*`rr_B FIN`+7.21274082853e-1 ) 
WHEN `rr_B FIN` <= -2.385110513921e-1 THEN  ( 5.277796377627e-1*`rr_B FIN`+2.42143270222e-1 ) 
WHEN `rr_B FIN` <= -2.191054501315e-1 THEN  ( 8.907675258773e-1*`rr_B FIN`+3.287198966887e-1 ) 
WHEN `rr_B FIN` <= -1.96644534909e-1 THEN  ( 6.649112566409e-1*`rr_B FIN`+2.79233554894e-1 ) 
WHEN `rr_B FIN` <= -1.874841594403e-1 THEN  ( 1.630338779996e0*`rr_B FIN`+4.690796108668e-1 ) 
WHEN `rr_B FIN` <= -1.709605065148e-1 THEN  ( 5.01062938201e-1*`rr_B FIN`+2.573582675989e-1 ) 
WHEN `rr_B FIN` <= -1.564481511031e-1 THEN  ( 5.705062927308e-1*`rr_B FIN`+2.692303393578e-1 ) 
WHEN `rr_B FIN` <= -1.391230843687e-1 THEN  ( 4.00300763526e-1*`rr_B FIN`+2.426019973041e-1 ) 
WHEN `rr_B FIN` <= -1.328595115092e-1 THEN  ( 1.107233458832e0*`rr_B FIN`+3.409526613856e-1 ) 
WHEN `rr_B FIN` <= -1.283722967422e-1 THEN  ( 2.157395436704e0*`rr_B FIN`+4.804766792728e-1 ) 
WHEN `rr_B FIN` <= -1.132960079741e-1 THEN  ( 6.421140381913e-1*`rr_B FIN`+2.859565107821e-1 ) 
WHEN `rr_B FIN` <= -9.978447728653e-2 THEN  ( 7.99451193778e-1*`rr_B FIN`+3.037821839895e-1 ) 
WHEN `rr_B FIN` <= -9.592257000442e-2 THEN  ( 2.797014156177e0*`rr_B FIN`+5.03107980015e-1 ) 
WHEN `rr_B FIN` <= -8.790306108636e-2 THEN  ( 6.486386167131e-1*`rr_B FIN`+2.970302554513e-1 ) 
WHEN `rr_B FIN` <= -8.031883950264e-2 THEN  ( 6.858664549702e-1*`rr_B FIN`+3.00302696764e-1 ) 
WHEN `rr_B FIN` <= -7.30772929983e-2 THEN  ( 7.523136479056e-1*`rr_B FIN`+3.056396588532e-1 ) 
WHEN `rr_B FIN` <= -7.276901289357e-2 THEN  ( 1.767196190613e1*`rr_B FIN`+1.542081921244e0 ) 
WHEN `rr_B FIN` <= -6.466458298742e-2 THEN  ( 2.557000550069e-2*`rr_B FIN`+2.579712250383e-1 ) 
WHEN `rr_B FIN` <= -4.614385473198e-2 THEN  ( 1.118910198466e-2*`rr_B FIN`+2.570412897656e-1 ) 
WHEN `rr_B FIN` <= -4.596019082881e-2 THEN  ( 1.137794244095e2*`rr_B FIN`+5.506747350591e0 ) 
WHEN `rr_B FIN` <= -3.225953698696e-2 THEN  ( 1.525268314065e0*`rr_B FIN`+3.475237925764e-1 ) 
WHEN `rr_B FIN` <= -2.129247414925e-2 THEN  ( 2.380390300509e0*`rr_B FIN`+3.751096404777e-1 ) 
WHEN `rr_B FIN` <= -9.177766516626e-3 THEN  ( 2.154892284288e0*`rr_B FIN`+3.703082275416e-1 ) 
WHEN `rr_B FIN` <= 1.653421596729e-2 THEN  ( 4.783880409428e-1*`rr_B FIN`+3.54921646267e-1 ) 
WHEN `rr_B FIN` <= 5.463061729794e-2 THEN  ( 3.228731454837e-1*`rr_B FIN`+3.574929615795e-1 ) 
WHEN `rr_B FIN` <= 6.712050901185e-2 THEN  ( 3.003879346819e0*`rr_B FIN`+2.11027964631e-1 ) 
WHEN `rr_B FIN` <= 1.131367186301e-1 THEN  ( 8.153241667379e-1*`rr_B FIN`+3.57924880433e-1 ) 
WHEN `rr_B FIN` <= 1.510116752514e-1 THEN  ( 1.203504483456e0*`rr_B FIN`+3.140074370446e-1 ) 
WHEN `rr_B FIN` <= 2.427072661871e-1 THEN  ( 4.971087446998e-1*`rr_B FIN`+4.206814338806e-1 ) 
WHEN `rr_B FIN` <= 2.775504544214e-1 THEN  ( 3.442805880061e0*`rr_B FIN`-2.94260635401e-1 ) 
WHEN `rr_B FIN` <= 3.297234404458e-1 THEN  ( 2.299242241516e0*`rr_B FIN`+2.313596070128e-2 ) 
WHEN `rr_B FIN` <= 3.897690765092e-1 THEN  ( 1.735854091018e0*`rr_B FIN`+2.08898234356e-1 ) 
WHEN `rr_B FIN` <= 3.969705150449e-1 THEN  ( 1.447356142671e1*`rr_B FIN`-4.755866063345e0 ) 
WHEN `rr_B FIN` <= 6.533064487896e-1 THEN  ( 1.142338841128e-2*`rr_B FIN`+9.851761777497e-1 ) 
WHEN `rr_B FIN` <= 6.882367232169e-1 THEN  ( 8.383057341929e-2*`rr_B FIN`+9.378720975693e-1 ) 
WHEN `rr_B FIN` <= 7.344333255128e-1 THEN  ( 4.792767508094e-2*`rr_B FIN`+9.625817903167e-1 ) 
WHEN `rr_B FIN` <= 7.347992769669e-1 THEN  ( 6.050244424323e0*`rr_B FIN`-3.445719600587e0 ) 
WHEN `rr_B FIN` <= 1.100384762221e0 THEN  ( 6.062363376151e-6*`rr_B FIN`+9.999911127557e-1 ) 
WHEN `rr_B FIN` <= 1.101384762269e0 THEN  ( 2.216311951499e-3*`rr_B FIN`+9.975589878103e-1 ) 
WHEN `rr_B FIN` > 1.101384752269e0 THEN 1.0e0
ELSE 1.0e0
END)
AS PROBA0 
FROM 
(
SELECT Id, 
( 
 (CASE 
WHEN ( `Modelo` IS NULL OR `Modelo` = ''  ) THEN 4.604972453966e-3
WHEN `Modelo` IN('321', '364', '377', '379', '395', 'AJUSTE.EXT', 'ARACION', 'P20638406', 'SOBRE')  THEN -3.194139925548e-2
WHEN `Modelo` IN('0031-01P14', '0101-04P14', '0101-05P14', '0276-01P14', '1169-3P14W', '1169-3P14Y', '1169-4P14W', '1169-4P14Y', '51193/PT', '51473/2', 'ALB-022', 'ALB-039', 'B-690-40Y', 'BOLA-0', 'DIFPRECIO', 'E249-55', 'FDL30-40Y', 'FLB18-45Y', 'FRANELA', 'G2SI20-40Y', 'G2SI20-45Y', 'G2SING-35Y', 'J-04', 'ME12369', 'MGBOA-MRTL', 'P20700207', 'PUL-CAB05P', 'RB024-45YW', 'STOVMO-PU', 'TAMBOR-00', 'VCL025-35F', 'VCL030-40F')  THEN -6.012713615127e-3
WHEN `Modelo` IN('0101-03P14', '0311-09P14', '56010/P', 'BR-281', 'C1-40', 'C1-45', 'DIAMANT-00', 'G2SI20-35Y', 'G2SING-40Y', 'G2SING-45Y', 'H-CD162', 'I-2262', 'M961022013', 'RB024-40YW', 'RD1302438Y', 'RXD030F-18', 'SEG5', 'SOL-ROJO', 'TAMBOR-0', 'VED35-35Y', 'VH205', 'VHM35', 'X6200218YW')  THEN -1.53010152361e-2
WHEN `Modelo` IN('AMIGO', 'CD-NIVADA', 'ESPECIAL', 'FVSU30-45Y', 'MARIPOSA', 'PROMOCION')  THEN 2.805117805228e-2
WHEN `Modelo` IN('371', '394', 'A15546G', 'GRABADO')  THEN -4.039726585228e-2
ELSE 4.604972453966e-3
END) +
 (CASE 
WHEN ( `Pieza` IS NULL OR `Pieza` = ''  ) THEN -2.571047316529e-4
WHEN `Pieza` IN('999999999999p')  THEN 2.665453355063e-2
WHEN `Pieza` IN('S88AJUSTE.EXp')  THEN -6.594690089385e-2
WHEN `Pieza` IN('DESPROMOCIONp')  THEN 7.848151115222e-2
ELSE -2.571047316529e-4
END) +
 (CASE 
WHEN ( `Costo US` IS NULL ) THEN -1.035072970119e-2
WHEN `Costo US` <= 0.0e0 THEN 2.451895116669e-2
WHEN `Costo US` <= 4.895100163086e-1 THEN  ( -1.201595317921e-5*`Costo US`+2.451895116669e-2 ) 
WHEN `Costo US` <= 4.9000001e-1 THEN  ( 4.018950737502e1*`Costo US`-1.964865293945e1 ) 
WHEN `Costo US` <= 5.2668964308e-1 THEN  ( 5.367230045586e-1*`Costo US`-2.187885979164e-1 ) 
WHEN `Costo US` <= 5.658057495143e-1 THEN  ( 4.721982576379e-1*`Costo US`-1.848040826343e-1 ) 
WHEN `Costo US` <= 6.229028797572e-1 THEN  ( -3.235138669679e-1*`Costo US`+2.65414404467e-1 ) 
WHEN `Costo US` <= 6.8000001e-1 THEN  ( -3.235138669679e-1*`Costo US`+2.654144044652e-1 ) 
WHEN `Costo US` <= 5.723444663823e0 THEN  ( -3.674399222753e-3*`Costo US`+4.792356639657e-2 ) 
WHEN `Costo US` <= 1.601000001e1 THEN  ( -8.924125918047e-4*`Costo US`+3.200101988574e-2 ) 
WHEN `Costo US` <= 2.33396474132e1 THEN  ( -1.24757999216e-3*`Costo US`+3.768724996452e-2 ) 
WHEN `Costo US` <= 3.993000001e1 THEN  ( -2.53184237359e-4*`Costo US`+1.447840366779e-2 ) 
WHEN `Costo US` <= 4.418531001615e1 THEN  ( -9.522686877444e-4*`Costo US`+4.239284577128e-2 ) 
WHEN `Costo US` <= 4.881000001e1 THEN  ( -8.080685479753e-4*`Costo US`+3.602131789227e-2 ) 
WHEN `Costo US` <= 5.971185956202e1 THEN  ( -3.497103118491e-4*`Costo US`+1.364885238657e-2 ) 
WHEN `Costo US` <= 7.800000001e1 THEN  ( -1.320172320583e-4*`Costo US`+6.499937804178e-4 ) 
WHEN `Costo US` <= 1.664786699022e2 THEN  ( -3.681967417493e-5*`Costo US`-6.775415734811e-3 ) 
WHEN `Costo US` <= 2.1502000001e2 THEN  ( -9.442419773564e-5*`Costo US`+2.814508726891e-3 ) 
WHEN `Costo US` <= 2.718773373612e2 THEN  ( -8.237109094987e-5*`Costo US`+2.228497053453e-4 ) 
WHEN `Costo US` <= 3.2045000001e2 THEN  ( -1.084177282451e-4*`Costo US`+7.3043400996e-3 ) 
WHEN `Costo US` <= 3.458437512161e2 THEN  ( -1.964113527012e-4*`Costo US`+3.550189705605e-2 ) 
WHEN `Costo US` <= 2.571420000001e4 THEN  ( -1.201595317922e-5*`Costo US`-2.827009965026e-2 ) 
WHEN `Costo US` > 2.57142e4 THEN -3.372507228914e-1
ELSE -3.372507228914e-1
END)+
 (CASE 
WHEN ( `Clave Dscto` IS NULL OR `Clave Dscto` = ''  ) THEN -1.009305857707e-1
WHEN `Clave Dscto` IN('CD', 'PRMGCRELOJES')  THEN 3.682852852899e-2
WHEN `Clave Dscto` IN('PRMBIJOYAS15', 'PRMBLBUENFIN', 'PRMCJBANAM12', 'PRMCJBANAMEX', 'PRMGCBUENFIN')  THEN 6.208520037407e-1
WHEN `Clave Dscto` IN('PRMCJBANAM18', 'PRMCJBANAM6', 'PRMGCBFDES', 'PRMGCJYBFIN', 'PRMGCRELFIN', 'PRMGCSOL')  THEN 6.300685203328e-1
WHEN `Clave Dscto` IN('EMP', 'PRMCJCUMPLE', 'PRMGC12', 'PRMGCPAGOANT', 'PRMGUCUMPLE')  THEN -1.723724197689e-1
WHEN `Clave Dscto` IN('PRMCJMCD', 'PRMGCSUCESP', 'PRMGUANIVERS')  THEN -3.241042759981e-1
WHEN `Clave Dscto` IN('PRMCJESPECIA', 'PRMGC5')  THEN -3.032099811879e-1
WHEN `Clave Dscto` IN('PRMGC10', 'PRMGCAMEX')  THEN -2.386923888585e-1
ELSE -1.009305857707e-1
END) +
 (CASE 
WHEN ( `% Dscto` IS NULL ) THEN -4.83226389158e-2
WHEN `% Dscto` <= 0.0e0 THEN -3.264928285653e-2
WHEN `% Dscto` <= 1.318786030846e0 THEN  ( -1.806323022286e-2*`% Dscto`-3.264928285891e-2 ) 
WHEN `% Dscto` <= 2.637572051692e0 THEN  ( -1.806323022286e-2*`% Dscto`-3.26492828613e-2 ) 
WHEN `% Dscto` <= 7.623623492505e0 THEN  ( 7.009115324464e-3*`% Dscto`-9.877940049306e-2 ) 
WHEN `% Dscto` < 1.0e1 THEN  ( 2.485230001603e-2*`% Dscto`-2.348091223044e-1 ) 
WHEN `% Dscto` <= 1.000000001e1 THEN 6.857866038363e-2
WHEN `% Dscto` <= 1.105161523466e1 THEN  ( -3.690166729277e-2*`% Dscto`+3.969331715289e-1 ) 
WHEN `% Dscto` <= 1.218573564218e1 THEN  ( -3.148048349312e-2*`% Dscto`+3.370203341093e-1 ) 
WHEN `% Dscto` < 1.5e1 THEN  ( 2.855968971502e-2*`% Dscto`-3.946133439116e-1 ) 
WHEN `% Dscto` <= 1.500000001e1 THEN 7.148606578701e-2
WHEN `% Dscto` <= 1.96618250126e1 THEN  ( 7.080353509451e-4*`% Dscto`+5.593945565364e-2 ) 
WHEN `% Dscto` <= 2.500000001e1 THEN  ( 9.588375612403e-4*`% Dscto`+5.100822648506e-2 ) 
WHEN `% Dscto` <= 5.171963228337e1 THEN  ( 1.603717143593e-3*`% Dscto`+3.488623693052e-2 ) 
WHEN `% Dscto` <= 7.172000001e1 THEN  ( 1.477364961955e-3*`% Dscto`+4.142112530475e-2 ) 
WHEN `% Dscto` <= 7.174828001134e1 THEN  ( -2.014605358497e-1*`% Dscto`+1.459612737152e1 ) 
WHEN `% Dscto` <= 1.0000000001e2 THEN  ( 1.764720204256e-3*`% Dscto`+1.506479681719e-2 ) 
WHEN `% Dscto` > 1.0e2 THEN 1.915368172427e-1
ELSE 1.915368172427e-1
END)+
 (CASE 
WHEN ( `NOMBRE COMERCIAL` IS NULL OR `NOMBRE COMERCIAL` = ''  ) THEN 2.544197864804e-3
WHEN `NOMBRE COMERCIAL` IN('DISTRIBUIDOR')  THEN -1.885233393592e-2
WHEN `NOMBRE COMERCIAL` IN('COMERCIALIZADORA')  THEN 6.514176901284e-2
ELSE 2.544197864804e-3
END) +
 (CASE 
WHEN ( `PZAS 1` IS NULL ) THEN 1.352681995702e-3
WHEN `PZAS 1` IN(-1)  THEN -3.243667691669e-2
ELSE 1.352681995702e-3
END) +
 (CASE 
WHEN ( `Costo Mxp` IS NULL ) THEN 4.501999693533e-3
WHEN `Costo Mxp` <= -2.116479e4 THEN -1.988704534993e-1
WHEN `Costo Mxp` <= -1.786781745924e1 THEN  ( 8.488475697698e-6*`Costo Mxp`-1.921364791943e-2 ) 
WHEN `Costo Mxp` <= 3.30000001e0 THEN  ( -2.084902435273e-4*`Costo Mxp`-2.309058406969e-2 ) 
WHEN `Costo Mxp` <= 5.485197669625e0 THEN  ( -2.093365287066e-3*`Costo Mxp`-1.687049642647e-2 ) 
WHEN `Costo Mxp` <= 9.401818191818e0 THEN  ( -6.457874786328e-4*`Costo Mxp`-2.481074683366e-2 ) 
WHEN `Costo Mxp` <= 1.849590910091e1 THEN  ( 2.902704213066e-4*`Costo Mxp`-3.361139301629e-2 ) 
WHEN `Costo Mxp` <= 2.759000001e1 THEN  ( 2.902704213066e-4*`Costo Mxp`-3.361139301602e-2 ) 
WHEN `Costo Mxp` <= 1.124827537169e2 THEN  ( 3.867421615273e-5*`Costo Mxp`-2.66698537155e-2 ) 
WHEN `Costo Mxp` <= 1.6874000001e2 THEN  ( 7.722477325776e-5*`Costo Mxp`-3.100612653517e-2 ) 
WHEN `Costo Mxp` <= 2.017926941597e2 THEN  ( 1.254809000853e-4*`Costo Mxp`-3.914886537563e-2 ) 
WHEN `Costo Mxp` <= 2.5905000001e2 THEN  ( 4.747456312335e-5*`Costo Mxp`-2.340775647906e-2 ) 
WHEN `Costo Mxp` <= 4.031734518341e2 THEN  ( 2.397685252593e-5*`Costo Mxp`-1.732067454845e-2 ) 
WHEN `Costo Mxp` <= 5.4670000001e2 THEN  ( 2.410594770898e-5*`Costo Mxp`-1.737272229867e-2 ) 
WHEN `Costo Mxp` <= 6.141379614713e2 THEN  ( 4.172675574713e-5*`Costo Mxp`-2.700601805285e-2 ) 
WHEN `Costo Mxp` <= 7.3617000001e2 THEN  ( 1.863926183437e-5*`Costo Mxp`-1.282711160579e-2 ) 
WHEN `Costo Mxp` <= 1.20169394258e3 THEN  ( 1.114939388418e-5*`Costo Mxp`-7.31329551638e-3 ) 
WHEN `Costo Mxp` <= 1.56000000001e3 THEN  ( 1.298013974381e-5*`Costo Mxp`-9.513291725815e-3 ) 
WHEN `Costo Mxp` <= 3.208195491785e3 THEN  ( 9.46493173322e-6*`Costo Mxp`-4.029567227731e-3 ) 
WHEN `Costo Mxp` <= 4.03581000001e3 THEN  ( 1.236117651634e-5*`Costo Mxp`-1.332128668298e-2 ) 
WHEN `Costo Mxp` <= 4.114719363758e3 THEN  ( 4.910600486393e-5*`Costo Mxp`-1.616164323761e-1 ) 
WHEN `Costo Mxp` <= 8.294517000001e4 THEN  ( 8.488475697698e-6*`Costo Mxp`+5.513301458719e-3 ) 
WHEN `Costo Mxp` > 8.294517e4 THEN 7.095913612451e-1
ELSE 7.095913612451e-1
END)+
 (CASE 
WHEN ( `Dscto` IS NULL ) THEN -5.313873386836e-2
WHEN `Dscto` <= -8.355e3 THEN 1.765273824821e-1
WHEN `Dscto` <= -8.35489242269e0 THEN  ( -1.820449103944e-5*`Dscto`+2.442885983236e-2 ) 
WHEN `Dscto` <= 1.0e-8 THEN  ( 1.414556219157e-3*`Dscto`+3.639942144901e-2 ) 
WHEN `Dscto` <= 1.764917420714e0 THEN  ( 6.764300765468e-3*`Dscto`+3.63994214502e-2 ) 
WHEN `Dscto` <= 3.529834831429e0 THEN  ( 6.764300765468e-3*`Dscto`+3.63994214514e-2 ) 
WHEN `Dscto` <= 1.844444167201e1 THEN  ( -8.208110728571e-4*`Dscto`+6.317361334153e-2 ) 
WHEN `Dscto` <= 2.250000001e1 THEN  ( -1.087308457302e-2*`Dscto`+2.485821854814e-1 ) 
WHEN `Dscto` <= 3.819918673877e1 THEN  ( -2.822336971591e-3*`Dscto`+6.744036444482e-2 ) 
WHEN `Dscto` <= 1.3845000001e2 THEN  ( -8.697100821036e-5*`Dscto`-3.704839076274e-2 ) 
WHEN `Dscto` <= 2.241312640509e2 THEN  ( -9.866431325831e-5*`Dscto`-3.54294526797e-2 ) 
WHEN `Dscto` <= 4.08584315069e2 THEN  ( -3.556566592993e-5*`Dscto`-4.957183226533e-2 ) 
WHEN `Dscto` <= 6.677921575395e2 THEN  ( -5.850228732838e-6*`Dscto`-6.171309381934e-2 ) 
WHEN `Dscto` <= 9.2700000001e2 THEN  ( -5.850228732838e-6*`Dscto`-6.171309381949e-2 ) 
WHEN `Dscto` <= 9.509505011476e2 THEN  ( 1.155013408099e-4*`Dscto`-1.742059987853e-1 ) 
WHEN `Dscto` <= 2.487750000001e4 THEN  ( -1.820449103944e-5*`Dscto`-4.705837102673e-2 ) 
WHEN `Dscto` > 2.48775e4 THEN -4.999405968605e-1
ELSE -4.999405968605e-1
END)+
 (CASE 
WHEN ( `Precio` IS NULL ) THEN 9.558064868765e-3
WHEN `Precio` <= -5.9259e4 THEN -7.691755898022e-2
WHEN `Precio` <= 5.676763782964e0 THEN  ( 1.088009269845e-6*`Precio`-1.244321765201e-2 ) 
WHEN `Precio` <= 6.500000001e1 THEN  ( -2.366277819936e-4*`Precio`-1.109376126131e-2 ) 
WHEN `Precio` <= 8.918910063732e1 THEN  ( -5.819047301994e-4*`Precio`+1.134924037065e-2 ) 
WHEN `Precio` <= 1.44538856349e2 THEN  ( -1.102571066248e-4*`Precio`-3.071658698959e-2 ) 
WHEN `Precio` <= 2.022694281795e2 THEN  ( 1.078412384349e-4*`Precio`-6.22402723533e-2 ) 
WHEN `Precio` <= 2.6000000001e2 THEN  ( 1.078412384349e-4*`Precio`-6.224027235268e-2 ) 
WHEN `Precio` <= 3.62231157252e2 THEN  ( 6.13722233071e-5*`Precio`-5.015832841883e-2 ) 
WHEN `Precio` <= 4.5000000001e2 THEN  ( 8.287597620058e-5*`Precio`-5.794765771376e-2 ) 
WHEN `Precio` <= 5.136048586851e2 THEN  ( 1.13947865554e-4*`Precio`-7.193000792209e-2 ) 
WHEN `Precio` <= 6.3601000001e2 THEN  ( 3.156139840953e-5*`Precio`-2.961591810721e-2 ) 
WHEN `Precio` <= 1.088487272389e3 THEN  ( 9.331737147457e-6*`Precio`-1.54776312475e-2 ) 
WHEN `Precio` <= 1.38100000001e3 THEN  ( 2.08134925279e-5*`Precio`-2.797537584307e-2 ) 
WHEN `Precio` <= 1.875576532146e3 THEN  ( 1.275446438154e-5*`Precio`-1.684585797232e-2 ) 
WHEN `Precio` <= 2.75800000001e3 THEN  ( 4.752822320992e-6*`Precio`-1.838165904575e-3 ) 
WHEN `Precio` <= 6.358827660417e3 THEN  ( 1.98611308004e-6*`Precio`+5.792418182685e-3 ) 
WHEN `Precio` <= 8.40000000001e3 THEN  ( 3.882945233968e-6*`Precio`-6.269210584068e-3 ) 
WHEN `Precio` <= 8.557450007488e3 THEN  ( 3.73213894536e-5*`Precio`-2.871521420284e-1 ) 
WHEN `Precio` <= 1.6585e5 THEN  ( 1.088009269845e-6*`Precio`+2.291319751317e-2 ) 
WHEN `Precio` > 1.6585e5 THEN 2.03359534917e-1
ELSE 2.03359534917e-1
END)+
 (CASE 
WHEN ( `VENTAS` IS NULL ) THEN -2.495144390514e-3
WHEN `VENTAS` <= -5.9259e4 THEN -5.247154876827e-2
WHEN `VENTAS` <= -8.940368351509e3 THEN  ( 1.323639910316e-6*`VENTAS`+2.59660286838e-2 ) 
WHEN `VENTAS` <= -8.88999999999e3 THEN  ( -2.467421333254e-4*`VENTAS`-2.191833359449e0 ) 
WHEN `VENTAS` <= -4.955861921065e3 THEN  ( -1.852319808315e-6*`VENTAS`-1.4762917283e-2 ) 
WHEN `VENTAS` <= -1.021723842141e3 THEN  ( -1.852319808315e-6*`VENTAS`-1.476291728373e-2 ) 
WHEN `VENTAS` <= -4.592470495596e2 THEN  ( 2.353729251073e-5*`VENTAS`+1.117825496694e-2 ) 
WHEN `VENTAS` <= 1.0000000001e2 THEN  ( 2.379460833238e-5*`VENTAS`+1.129642650017e-2 ) 
WHEN `VENTAS` <= 1.000009087451e2 THEN  ( 1.382891892286e1*`VENTAS`-1.382878216399e3 ) 
WHEN `VENTAS` <= 1.000029831244e2 THEN  ( 2.653912802222e0*`VENTAS`-2.653674492146e2 ) 
WHEN `VENTAS` <= 1.005014915672e2 THEN  ( -1.104205836002e-2*`VENTAS`+1.135986708964e0 ) 
WHEN `VENTAS` <= 1.0100000001e2 THEN  ( -1.104205836002e-2*`VENTAS`+1.135986708963e0 ) 
WHEN `VENTAS` <= 2.585284350047e2 THEN  ( -3.362382315537e-5*`VENTAS`+2.413482073942e-2 ) 
WHEN `VENTAS` <= 3.6900000001e2 THEN  ( -6.973756357273e-5*`VENTAS`+3.347124953055e-2 ) 
WHEN `VENTAS` <= 6.156696995903e2 THEN  ( -3.050127564797e-5*`VENTAS`+1.899305928556e-2 ) 
WHEN `VENTAS` <= 1.13000000001e3 THEN  ( -5.996420227175e-6*`VENTAS`+3.906162310076e-3 ) 
WHEN `VENTAS` <= 4.974170831596e3 THEN  ( 3.442534848557e-7*`VENTAS`-3.258798984386e-3 ) 
WHEN `VENTAS` <= 7.89360000001e3 THEN  ( -3.744612270762e-7*`VENTAS`+3.162107718281e-4 ) 
WHEN `VENTAS` <= 8.050136407445e3 THEN  ( -3.034621934255e-5*`VENTAS`+2.369012806317e-1 ) 
WHEN `VENTAS` <= 1.6443e5 THEN  ( 1.323639910316e-6*`VENTAS`-1.804540633749e-2 ) 
WHEN `VENTAS` > 1.6443e5 THEN 1.996007041158e-1
ELSE 1.996007041158e-1
END)+
 (CASE 
WHEN ( `ESPACIOS` IS NULL OR `ESPACIOS` = ''  ) THEN 4.577511168101e-3
WHEN `ESPACIOS` IN('321', '364', '377', '379', '395', 'AJUSTE.EXT', 'ARACION', 'P20638406', 'SOBRE')  THEN -3.176232277725e-2
WHEN `ESPACIOS` IN('0031-01P14', '0101-04P14', '0101-05P14', '0276-01P14', '1169-3P14W', '1169-3P14Y', '1169-4P14W', '1169-4P14Y', '51193/PT', '51473/2', 'ALB-022', 'ALB-039', 'B-690-40Y', 'BOLA-0', 'DIFPRECIO', 'E249-55', 'FDL30-40Y', 'FLB18-45Y', 'FRANELA', 'G2SI20-40Y', 'G2SI20-45Y', 'G2SING-35Y', 'J-04', 'ME12369', 'MGBOA-MRTL', 'P20700207', 'PUL-CAB05P', 'RB024-45YW', 'STOVMO-PU', 'TAMBOR-00', 'VCL025-35F', 'VCL030-40F')  THEN -5.98017022644e-3
WHEN `ESPACIOS` IN('0101-03P14', '0311-09P14', '56010/P', 'BR-281', 'C1-40', 'C1-45', 'DIAMANT-00', 'G2SI20-35Y', 'G2SING-40Y', 'G2SING-45Y', 'H-CD162', 'I-2262', 'M961022013', 'RB024-40YW', 'RD1302438Y', 'RXD030F-18', 'SEG5', 'SOL-ROJO', 'TAMBOR-0', 'VED35-35Y', 'VH205', 'VHM35', 'X6200218YW')  THEN -1.521598004154e-2
WHEN `ESPACIOS` IN('AMIGO', 'CD-NIVADA', 'ESPECIAL', 'FVSU30-45Y', 'MARIPOSA', 'PROMOCION')  THEN 2.789121313736e-2
WHEN `ESPACIOS` IN('371', '394', 'A15546G', 'GRABADO')  THEN -4.017040198235e-2
ELSE 4.577511168101e-3
END) +
 (CASE 
WHEN ( `REPARACIONES` IS NULL ) THEN 1.39953859604e-2
WHEN `REPARACIONES` IN(1)  THEN -2.09488588081e-1
ELSE 1.39953859604e-2
END) +
 (CASE 
WHEN ( `PIEZAS TOTALES` IS NULL ) THEN -2.149874153586e-2
WHEN `PIEZAS TOTALES` IN(-2, 0)  THEN 2.186515650299e-1
WHEN `PIEZAS TOTALES` IN(-1)  THEN 1.037553915589e-1
ELSE -2.149874153586e-2
END) +
 (CASE 
WHEN ( `FACTURAS CON REPETIDAS` IS NULL ) THEN 1.358906190799e-3
WHEN `FACTURAS CON REPETIDAS` IN(0)  THEN -3.256133143803e-2
ELSE 1.358906190799e-3
END) +
 (CASE 
WHEN ( `NO FACTURAS` IS NULL ) THEN -5.794438521263e-4
WHEN `NO FACTURAS` <= 0.0e0 THEN -4.991687522295e-3
WHEN `NO FACTURAS` <= 1.58165e5 THEN  ( 4.368255338469e-8*`NO FACTURAS`-4.991687521604e-3 ) 
WHEN `NO FACTURAS` <= 1.58324e5 THEN  ( 1.010448606377e-4*`NO FACTURAS`-1.59799115019e1 ) 
WHEN `NO FACTURAS` <= 1.58866e5 THEN  ( 2.950595728506e-5*`NO FACTURAS`-4.653586167493e0 ) 
WHEN `NO FACTURAS` <= 1.59409e5 THEN  ( 2.950595728506e-5*`NO FACTURAS`-4.653586167492e0 ) 
WHEN `NO FACTURAS` <= 1.61165e5 THEN  ( -9.063910410775e-6*`NO FACTURAS`+1.494817301053e0 ) 
WHEN `NO FACTURAS` <= 1.62338e5 THEN  ( -2.037028412536e-5*`NO FACTURAS`+3.317011949548e0 ) 
WHEN `NO FACTURAS` <= 1.64777e5 THEN  ( -9.768158452421e-6*`NO FACTURAS`+1.595884072052e0 ) 
WHEN `NO FACTURAS` <= 1.7063e5 THEN  ( -1.661434019682e-6*`NO FACTURAS`+2.600747268442e-1 ) 
WHEN `NO FACTURAS` <= 1.78862e5 THEN  ( 1.256094554221e-6*`NO FACTURAS`-2.377458619056e-1 ) 
WHEN `NO FACTURAS` <= 1.87094e5 THEN  ( 1.256094554221e-6*`NO FACTURAS`-2.377458619045e-1 ) 
WHEN `NO FACTURAS` <= 1.96652e5 THEN  ( 1.087784073095e-6*`NO FACTURAS`-2.062559807476e-1 ) 
WHEN `NO FACTURAS` <= 1.9759e5 THEN  ( 1.085744880256e-4*`NO FACTURAS`-2.134378221537e1 ) 
WHEN `NO FACTURAS` <= 1.97668e5 THEN  ( 1.291378732478e-3*`NO FACTURAS`-2.550540728767e2 ) 
WHEN `NO FACTURAS` <= 1.97747e5 THEN  ( 1.291378732479e-3*`NO FACTURAS`-2.55054072877e2 ) 
WHEN `NO FACTURAS` <= 1.97854e5 THEN  ( -9.554182040507e-4*`NO FACTURAS`+1.892446055898e2 ) 
WHEN `NO FACTURAS` <= 1.97914e5 THEN  ( -3.018242077427e-3*`NO FACTURAS`+5.973827315866e2 ) 
WHEN `NO FACTURAS` <= 1.97935e5 THEN  ( -8.318157734049e-3*`NO FACTURAS`+1.646310238851e3 ) 
WHEN `NO FACTURAS` <= 1.97988e5 THEN  ( -1.411445187725e-3*`NO FACTURAS`+2.792249727828e2 ) 
WHEN `NO FACTURAS` <= 1.98026e5 THEN  ( 1.973961437953e-3*`NO FACTURAS`-3.910466728748e2 ) 
WHEN `NO FACTURAS` <= 1.98064e5 THEN  ( 1.973961437956e-3*`NO FACTURAS`-3.910466728754e2 ) 
WHEN `NO FACTURAS` <= 2.074e5 THEN  ( 8.022307725723e-6*`NO FACTURAS`-1.664904985458e0 ) 
WHEN `NO FACTURAS` <= 2.16737e5 THEN  ( 8.022307725723e-6*`NO FACTURAS`-1.66490498545e0 ) 
WHEN `NO FACTURAS` <= 2.28063e5 THEN  ( -6.533746286422e-6*`NO FACTURAS`+1.489944120638e0 ) 
WHEN `NO FACTURAS` <= 2.3939e5 THEN  ( -6.533746286422e-6*`NO FACTURAS`+1.48994412063e0 ) 
WHEN `NO FACTURAS` <= 2.39424e5 THEN  ( -2.170684252188e-3*`NO FACTURAS`+5.195659337284e2 ) 
WHEN `NO FACTURAS` <= 2.39466e5 THEN  ( -1.45766964483e-3*`NO FACTURAS`+3.488528972673e2 ) 
WHEN `NO FACTURAS` <= 2.39503e5 THEN  ( 1.63227110164e-3*`NO FACTURAS`-3.910834635151e2 ) 
WHEN `NO FACTURAS` <= 2.39541e5 THEN  ( 1.632271101638e-3*`NO FACTURAS`-3.910834635148e2 ) 
WHEN `NO FACTURAS` <= 2.39618e5 THEN  ( 7.87133039149e-4*`NO FACTURAS`-1.88638246888e2 ) 
WHEN `NO FACTURAS` <= 2.39647e5 THEN  ( 5.854427326653e-3*`NO FACTURAS`-1.4028560121e3 ) 
WHEN `NO FACTURAS` <= 2.39669e5 THEN  ( 7.548555655076e-3*`NO FACTURAS`-1.808848783621e3 ) 
WHEN `NO FACTURAS` <= 2.39693e5 THEN  ( 6.304943067661e-3*`NO FACTURAS`-1.510793328275e3 ) 
WHEN `NO FACTURAS` <= 2.39714e5 THEN  ( -7.278698972186e-3*`NO FACTURAS`+1.745113167027e3 ) 
WHEN `NO FACTURAS` <= 2.39735e5 THEN  ( -7.278698972186e-3*`NO FACTURAS`+1.745113167027e3 ) 
WHEN `NO FACTURAS` <= 2.39939e5 THEN  ( -7.439170419769e-4*`NO FACTURAS`+1.784972209884e2 ) 
WHEN `NO FACTURAS` <= 2.46207e5 THEN  ( -7.485425556769e-7*`NO FACTURAS`+1.817214883869e-1 ) 
WHEN `NO FACTURAS` <= 2.51037e5 THEN  ( 1.071733488968e-6*`NO FACTURAS`-2.66443547238e-1 ) 
WHEN `NO FACTURAS` <= 2.55867e5 THEN  ( 1.071733488968e-6*`NO FACTURAS`-2.664435472375e-1 ) 
WHEN `NO FACTURAS` <= 2.55879e5 THEN  ( 3.981030196355e-4*`NO FACTURAS`-1.018536476397e2 ) 
WHEN `NO FACTURAS` <= 2.68341e5 THEN  ( 4.368255338469e-8*`NO FACTURAS`+1.56615390466e-3 ) 
ELSE 1.328797396246e-2
END)+
 (CASE 
WHEN ( `REPETIDAS` IS NULL ) THEN -4.256573645277e-2
WHEN `REPETIDAS` <= -1.71857e5 THEN -9.951120573214e-3
WHEN `REPETIDAS` <= -1.72e2 THEN  ( 8.421670251585e-8*`REPETIDAS`+4.522109272498e-3 ) 
WHEN `REPETIDAS` < -1.0e0 THEN  ( -2.922445054604e-5*`REPETIDAS`-5.440048662135e-4 ) 
WHEN `REPETIDAS` <= 0.0e0 THEN  ( -5.036721255264e-3*`REPETIDAS`-5.551501671434e-3 ) 
WHEN `REPETIDAS` <= 2.68e2 THEN  ( -6.945092245943e-5*`REPETIDAS`-2.420924063643e-2 ) 
WHEN `REPETIDAS` <= 2.68321e5 THEN  ( 8.421670251585e-8*`REPETIDAS`-4.286697959544e-2 ) 
ELSE -2.026986975969e-2
END)+
 (CASE 
WHEN ( `FACTURAS` IS NULL ) THEN 3.295221252005e-3
WHEN `FACTURAS` IN(1)  THEN -2.109894238137e-3
ELSE 3.295221252005e-3
END) +
 (CASE 
WHEN ( `VENTAS S IVA` IS NULL ) THEN -2.494266555011e-3
WHEN `VENTAS S IVA` <= -5.108534483e4 THEN -5.248296587592e-2
WHEN `VENTAS S IVA` <= -7.707214095682e3 THEN  ( 1.535422212327e-6*`VENTAS S IVA`+2.59546073071e-2 ) 
WHEN `VENTAS S IVA` <= -7.66379310299e3 THEN  ( -2.861081512905e-4*`VENTAS S IVA`-2.19097599693e0 ) 
WHEN `VENTAS S IVA` <= -4.272294759315e3 THEN  ( -2.14724787542e-6*`VENTAS S IVA`-1.475838381686e-2 ) 
WHEN `VENTAS S IVA` <= -8.807964156397e2 THEN  ( -2.14724787542e-6*`VENTAS S IVA`-1.475838381759e-2 ) 
WHEN `VENTAS S IVA` <= -3.959026289313e2 THEN  ( 2.729316513512e-5*`VENTAS S IVA`+1.117262643867e-2 ) 
WHEN `VENTAS S IVA` <= 8.620689656e1 THEN  ( 2.759153456149e-5*`VENTAS S IVA`+1.129075168029e-2 ) 
WHEN `VENTAS S IVA` <= 8.620767995233e1 THEN  ( 1.603526186374e1*`VENTAS S IVA`-1.382336491308e3 ) 
WHEN `VENTAS S IVA` <= 8.62094682104e1 THEN  ( 3.077332869838e0*`VENTAS S IVA`-2.652634958856e2 ) 
WHEN `VENTAS S IVA` <= 8.66392168702e1 THEN  ( -1.2803769414e-2*`VENTAS S IVA`+1.13554045089e0 ) 
WHEN `VENTAS S IVA` <= 8.706896553e1 THEN  ( -1.2803769414e-2*`VENTAS S IVA`+1.135540450889e0 ) 
WHEN `VENTAS S IVA` <= 2.22869340538e2 THEN  ( -3.898775448264e-5*`VENTAS S IVA`+2.412411670578e-2 ) 
WHEN `VENTAS S IVA` <= 3.1810344831e2 THEN  ( -8.086328293797e-5*`VENTAS S IVA`+3.345688811611e-2 ) 
WHEN `VENTAS S IVA` <= 5.307497410326e2 THEN  ( -3.536701829619e-5*`VENTAS S IVA`+1.898436944804e-2 ) 
WHEN `VENTAS S IVA` <= 9.7413793101e2 THEN  ( -6.952521243417e-6*`VENTAS S IVA`+3.903382495678e-3 ) 
WHEN `VENTAS S IVA` <= 4.288078302969e3 THEN  ( 3.997790012068e-7*`VENTAS S IVA`-3.258772052578e-3 ) 
WHEN `VENTAS S IVA` <= 6.80482758601e3 THEN  ( -4.336034739016e-7*`VENTAS S IVA`+3.148372568921e-4 ) 
WHEN `VENTAS S IVA` <= 6.939772764834e3 THEN  ( -3.518722343761e-5*`VENTAS S IVA`+2.368072290988e-1 ) 
WHEN `VENTAS S IVA` <= 1.4175e5 THEN  ( 1.535422212327e-6*`VENTAS S IVA`-1.803958701418e-2 ) 
WHEN `VENTAS S IVA` > 1.4175e5 THEN 1.996065115832e-1
ELSE 1.996065115832e-1
END)+
 (CASE 
WHEN ( `UTILIDAD` IS NULL ) THEN -9.075064294325e-5
WHEN `UTILIDAD` <= -3.830275862e4 THEN 2.184411894656e-1
WHEN `UTILIDAD` <= -3.272678419736e2 THEN  ( -5.59301763766e-6*`UTILIDAD`+4.213184911662e-3 ) 
WHEN `UTILIDAD` <= -2.8925482759e2 THEN  ( 9.980781195293e-6*`UTILIDAD`+9.309988447248e-3 ) 
WHEN `UTILIDAD` <= -3.808082822951e1 THEN  ( -8.790978804682e-7*`UTILIDAD`+6.168715997421e-3 ) 
WHEN `UTILIDAD` <= 3.963624948805e1 THEN  ( -1.321048160351e-5*`UTILIDAD`+5.699126691805e-3 ) 
WHEN `UTILIDAD` <= 5.45848276e1 THEN  ( -2.114869566973e-4*`UTILIDAD`+1.355806252394e-2 ) 
WHEN `UTILIDAD` <= 6.5945950245e1 THEN  ( -2.765012480109e-4*`UTILIDAD`+1.710685640586e-2 ) 
WHEN `UTILIDAD` <= 8.296427658132e1 THEN  ( -1.263274101257e-4*`UTILIDAD`+7.203499965868e-3 ) 
WHEN `UTILIDAD` <= 9.705110379566e1 THEN  ( 1.402664622946e-4*`UTILIDAD`-1.491426779763e-2 ) 
WHEN `UTILIDAD` <= 1.1113793101e2 THEN  ( 1.402664622946e-4*`UTILIDAD`-1.491426779743e-2 ) 
WHEN `UTILIDAD` <= 1.407675183793e2 THEN  ( 6.375311485374e-5*`UTILIDAD`-6.410732668782e-3 ) 
WHEN `UTILIDAD` <= 2.2403000001e2 THEN  ( 3.188604582988e-6*`UTILIDAD`+2.114783143312e-3 ) 
WHEN `UTILIDAD` <= 2.316474795475e2 THEN  ( 9.039406775364e-5*`UTILIDAD`-1.742185677074e-2 ) 
WHEN `UTILIDAD` <= 3.266396135319e2 THEN  ( -4.975769044223e-6*`UTILIDAD`+4.670325547342e-3 ) 
WHEN `UTILIDAD` <= 3.78916358471e2 THEN  ( -6.714620774157e-6*`UTILIDAD`+5.238303404344e-3 ) 
WHEN `UTILIDAD` <= 4.3119310341e2 THEN  ( -6.714620774157e-6*`UTILIDAD`+5.238303404309e-3 ) 
WHEN `UTILIDAD` <= 7.527162966632e2 THEN  ( -5.775380099591e-6*`UTILIDAD`+4.833309302818e-3 ) 
WHEN `UTILIDAD` <= 1.074239489916e3 THEN  ( -5.775380099591e-6*`UTILIDAD`+4.833309302632e-3 ) 
WHEN `UTILIDAD` <= 2.800249980671e3 THEN  ( -5.559046951269e-6*`UTILIDAD`+4.60091569077e-3 ) 
WHEN `UTILIDAD` <= 2.88564655201e3 THEN  ( 8.284452957814e-6*`UTILIDAD`-3.416434466185e-2 ) 
WHEN `UTILIDAD` <= 2.988237610331e3 THEN  ( 5.958558368207e-6*`UTILIDAD`-2.745263495897e-2 ) 
WHEN `UTILIDAD` <= 1.054767e5 THEN  ( -5.59301763766e-6*`UTILIDAD`+7.06621886292e-3 ) 
WHEN `UTILIDAD` > 1.054767e5 THEN -5.828668245993e-1
ELSE -5.828668245993e-1
END)+
 (CASE 
WHEN ( `VENTAS SIN REP` IS NULL ) THEN -2.623717559249e-2
WHEN `VENTAS SIN REP` <= -5.9259e4 THEN -7.562517364087e-2
WHEN `VENTAS SIN REP` <= -8.940368351509e3 THEN  ( 1.110531416703e-6*`VENTAS SIN REP`-9.816192412894e-3 ) 
WHEN `VENTAS SIN REP` <= -8.88999999999e3 THEN  ( 6.515074985913e-5*`VENTAS SIN REP`+5.627269497745e-1 ) 
WHEN `VENTAS SIN REP` <= -6.063252739881e3 THEN  ( 2.251631040071e-6*`VENTAS SIN REP`+3.553783473685e-3 ) 
WHEN `VENTAS SIN REP` <= -1.098616354794e3 THEN  ( 1.480464038252e-6*`VENTAS SIN REP`-1.121996962272e-3 ) 
WHEN `VENTAS SIN REP` <= -4.993081773922e2 THEN  ( -1.953970324181e-6*`VENTAS SIN REP`-4.895122722461e-3 ) 
WHEN `VENTAS SIN REP` <= 1.0000000001e2 THEN  ( -1.953970324181e-6*`VENTAS SIN REP`-4.895122722578e-3 ) 
WHEN `VENTAS SIN REP` <= 1.242407240912e2 THEN  ( -7.465374636741e-5*`VENTAS SIN REP`+2.374854881564e-3 ) 
WHEN `VENTAS SIN REP` <= 1.484814481724e2 THEN  ( -7.465374636741e-5*`VENTAS SIN REP`+2.374854881383e-3 ) 
WHEN `VENTAS SIN REP` <= 2.065467956821e2 THEN  ( 3.274008383897e-5*`VENTAS SIN REP`-1.357113655117e-2 ) 
WHEN `VENTAS SIN REP` <= 2.6000000001e2 THEN  ( 3.84337953611e-5*`VENTAS SIN REP`-1.474715442135e-2 ) 
WHEN `VENTAS SIN REP` <= 5.266236297728e2 THEN  ( 8.593169229342e-6*`VENTAS SIN REP`-6.988591626859e-3 ) 
WHEN `VENTAS SIN REP` <= 1.23480000001e3 THEN  ( 2.171174182727e-6*`VENTAS SIN REP`-3.606617284938e-3 ) 
WHEN `VENTAS SIN REP` <= 5.408904846248e3 THEN  ( 1.290479494633e-6*`VENTAS SIN REP`-2.519135483542e-3 ) 
WHEN `VENTAS SIN REP` <= 8.09919000001e3 THEN  ( 1.543720286396e-6*`VENTAS SIN REP`-3.888890828959e-3 ) 
WHEN `VENTAS SIN REP` <= 8.255520817435e3 THEN  ( 8.5652457469e-6*`VENTAS SIN REP`-6.075755962328e-2 ) 
WHEN `VENTAS SIN REP` <= 1.6443e5 THEN  ( 1.110531416703e-6*`VENTAS SIN REP`+7.849897349645e-4 ) 
WHEN `VENTAS SIN REP` > 1.6443e5 THEN 1.833896705834e-1
ELSE 1.833896705834e-1
END)+
 (CASE 
WHEN ( `TIENDA ANCLA` IS NULL OR `TIENDA ANCLA` = ''  ) THEN -4.204114590208e-4
WHEN `TIENDA ANCLA` IN('SANBORNS', 'SANBORNS, SEARS', 'SEARS', 'SEARS, CINEPOLIS', 'SUBURBIA, WALMART', 'WALMART, SUBURBIA')  THEN 3.485352889053e-3
WHEN `TIENDA ANCLA` IN('CIERRE DE TIENDA', 'CINEMEX', 'LIVERPOOL, SANBORNS, CAMINO REAL', 'PALACIO DE HIERRO', 'SANBORNS, CINEMEX', 'SUBURBIA, SANBORNS')  THEN -7.631701254158e-3
WHEN `TIENDA ANCLA` IN('LIVERPOOL, CINEPOLIS')  THEN 1.012029617809e-2
ELSE -4.204114590208e-4
END) +
 (CASE 
WHEN ( `UBICACI�N` IS NULL OR `UBICACI�N` = ''  ) THEN 2.478803363743e-3
WHEN `UBICACI�N` IN(' Cuautitl�n Izcalli,', 'Deleg. Benito Ju�rez', 'Delegaci�n Cuajimalpa', 'Naucalpan', 'Tabasco')  THEN -1.585386458721e-2
WHEN `UBICACI�N` IN('Cuautitl�n Izcalli', 'Delegaci�n Cuahutemoc.', 'Delegaci�n Gustavo Amadero', 'Ecatepec', 'Merida')  THEN 1.795124940106e-2
WHEN `UBICACI�N` IN('Cancun', 'Ciudad del Valle', 'Delegaci�n Miguel Hidalgo', 'Monterrey')  THEN -3.22073535643e-2
WHEN `UBICACI�N` IN('Atizapan', 'Fraccionamiento Altabrisa', 'Nayarit', 'Nezahualcoyot', 'Villahermosa')  THEN 4.42843212429e-2
ELSE 2.478803363743e-3
END) +
 (CASE 
WHEN ( `RANGOS` IS NULL OR `RANGOS` = ''  ) THEN -5.100506278634e-3
WHEN `RANGOS` IN('005.- 2,500-5,000')  THEN 9.918675527254e-3
WHEN `RANGOS` IN('002.- 20,000-50,000', '004.- 5,000-10,000')  THEN 1.465934764826e-2
WHEN `RANGOS` IN('NO')  THEN -1.295990417343e-2
WHEN `RANGOS` IN('001.- 50,000-100,000', '003.- 10,000-20,000')  THEN 2.339434690617e-2
ELSE -5.100506278634e-3
END) 
) AS `rr_B FIN` FROM Datos;
) TMPTABLE0
END //
DELIMITER ;