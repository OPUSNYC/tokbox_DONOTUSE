/* This file was generated as part of a ForgeModule.
 *
 * You may move this file to another package if you require, however do not modify its contents.
 * To add more resources: rebuild the inspector project.
 */

package io.trigger.forge.android.modules.opus_tokbox;

import java.lang.reflect.Field;
import android.util.Log;

public class R {
    public static class attr {
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$attr");
	            for (Field f : attr.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class drawable {
        public static int background=0x7f020000;
        public static int qb_ico=0x7f020001;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$drawable");
	            for (Field f : drawable.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class id {
        public static int audioCallBtn=0x7f050001;
        public static int cameraView=0x7f050006;
        public static int camera_preview=0x7f050009;
        public static int loginByFirstUserBtn=0x7f050003;
        public static int loginBySecondUserBtn=0x7f050004;
        public static int opponentImageLoading=0x7f050008;
        public static int opponentView=0x7f050007;
        public static int textView=0x7f050005;
        public static int txtName=0x7f050000;
        public static int videoCallBtn=0x7f050002;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$id");
	            for (Field f : id.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class layout {
        public static int call_layout=0x7f030000;
        public static int login_layout=0x7f030001;
        public static int video_chat_layout=0x7f030002;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$layout");
	            for (Field f : layout.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class string {
        public static int app_name=0x7f040000;
        public static int audio_call_txt=0x7f04000e;
        public static int call_canceled_txt=0x7f04000c;
        public static int call_start_txt=0x7f04000b;
        public static int call_user=0x7f040007;
        public static int calling_dialog_title=0x7f040008;
        public static int calling_dialog_txt=0x7f040009;
        public static int login=0x7f040002;
        public static int login_by_first_user=0x7f040005;
        public static int login_by_second_user=0x7f040006;
        public static int login_screen_title=0x7f04000a;
        public static int password=0x7f040003;
        public static int please_wait=0x7f040004;
        public static int start_chat=0x7f040001;
        public static int video_call_txt=0x7f04000d;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$string");
	            for (Field f : string.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
}
