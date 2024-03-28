package com.example.tugaspuasa.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tugaspuasa.R;

public class ProfileFragment extends Fragment {

    private Button fragkecil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        fragkecil = view.findViewById(R.id.logout);

        fragkecil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                View dialogView = LayoutInflater.from(getActivity()).inflate(R.layout.yakin, null);
                builder.setView(dialogView);

                TextView messageTextView = dialogView.findViewById(R.id.dialog_message);
                messageTextView.setText("Apakah Anda ingin keluar?");

                Button buttonYes = dialogView.findViewById(R.id.button_yes);
                Button buttonNo = dialogView.findViewById(R.id.button_no);

                AlertDialog dialog = builder.create();

                buttonYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().finishAffinity(); // Finish all activities and exit
                    }
                });

                buttonNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        return view;
    }
}
