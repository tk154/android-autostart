package de.kaiser.autostart

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent


class BootCompletedReceiver : BroadcastReceiver() {
    private val autostartApp = ""

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            context.packageManager.getLaunchIntentForPackage(autostartApp)?.let {
                context.startActivity(it)
            }
        }
    }
}