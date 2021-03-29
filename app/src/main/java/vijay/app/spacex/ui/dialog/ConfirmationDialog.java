package vijay.app.spacex.ui.dialog;

import android.app.Activity;

import androidx.appcompat.app.AlertDialog;

import vijay.app.spacex.R;
import vijay.app.spacex.Utils.calback.DeleteConfirmation;

public class ConfirmationDialog {
    public static AlertDialog getDialog(Activity activity, DeleteConfirmation listener) {
        String msz = "   Delete all data?";
        AlertDialog alertDialog =  new AlertDialog.Builder(activity)
                .setTitle(R.string.delete)
                .setMessage(msz)
                .setIcon(R.drawable.ic_delete)
                .setPositiveButton(R.string.delete, (dialog, whichButton) -> {
                    listener.onDelete();
                    dialog.dismiss();
                })
                .setNegativeButton(R.string.cancel, (dialog, which) -> {
                    dialog.dismiss();
                })
                .create();
        return alertDialog;
    }
}
