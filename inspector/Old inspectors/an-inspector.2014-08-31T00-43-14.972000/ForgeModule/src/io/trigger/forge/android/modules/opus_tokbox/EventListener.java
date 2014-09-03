package io.trigger.forge.android.modules.opus_tokbox;

import io.trigger.forge.android.core.ForgeApp;
import io.trigger.forge.android.core.ForgeEventListener;

public class EventListener extends ForgeEventListener {
	@Override
	public void onRestart() {
		ForgeApp.event("opus_tokbox.resume", null);
	}
}
