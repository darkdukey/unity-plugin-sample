using UnityEngine;
using UnityEngine.UI;
using System.Collections;
using System.Runtime.InteropServices;

public class My_Plugin : MonoBehaviour
{
	// import function for iOS
	//[DllImport("__Internal")]
	//extern static public string getMessage();

	void Start()
	{
		#if UNITY_ANDROID
		AndroidJavaClass pluginClass = new AndroidJavaClass("com.sdkbox.myplugin.My_Plugin");
		pluginClass.CallStatic("start");
		AndroidJavaObject instance = pluginClass.CallStatic<AndroidJavaObject>.CallStatic("getInstance");

		#elif UNITY_IOS
		string message = getMessage();
		#endif
	}
}
