package com.example.android_animation.widgets

//val state = rememberOneTapSignInState()
//var user: GoogleUser? by remember { mutableStateOf(null) }
//OneTapSignInWithGoogle(
//state = state,
//clientId = "YOUR_CLIENT_ID",
//onTokenIdReceived = {
//    user = getUserFromTokenId(tokenId = it)
//    Log.d("MainActivity", user.toString())
//},
//onDialogDismissed = {
//    Log.d("MainActivity", it)
//}
//)
//
//Column(
//modifier = Modifier.fillMaxSize(),
//verticalArrangement = Arrangement.Center,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Box(
//        modifier = Modifier.weight(2f),
//        contentAlignment = Alignment.Center
//    ) {
//        Button(
//            onClick = { state.open() },
//            enabled = !state.opened
//        ) {
//            Text(text = "Sign in")
//        }
//    }
//    Column(
//        modifier = Modifier
//            .weight(10f)
//            .fillMaxWidth()
//            .padding(horizontal = 24.dp),
//        verticalArrangement = Arrangement.spacedBy(12.dp)
//    ) {
//        if (user != null) {
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("SUB: ")
//                    }
//                    append(user!!.sub)
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("EMAIL: ")
//                    }
//                    append(user!!.email)
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("EMAIL VERIFIED: ")
//                    }
//                    append(user!!.emailVerified.toString())
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("FULL NAME: ")
//                    }
//                    append(user!!.fullName)
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("GIVEN NAME: ")
//                    }
//                    append(user!!.givenName)
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("FAMILY NAME: ")
//                    }
//                    append(user!!.familyName)
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("PICTURE: ")
//                    }
//                    append(user!!.picture)
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("ISSUED AT: ")
//                    }
//                    append(user!!.issuedAt.toString())
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("EXPIRATION TIME: ")
//                    }
//                    append(user!!.expirationTime.toString())
//                }
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                        append("LOCALE: ")
//                    }
//                    append(user!!.locale)
//                }
//            )
//        } else {
//            Text(
//                modifier = Modifier.fillMaxWidth(),
//                textAlign = TextAlign.Center,
//                text = "Waiting for a User..."
//            )
//        }
//
//
//    }
//}