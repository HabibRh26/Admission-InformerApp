package com.example.user.kidsed.fragment;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.ImageView;

        import com.example.user.kidsed.Letters_Words_Activity;
        import com.example.user.kidsed.R;

/**
 * Created by User on 3/29/2018.
 */

public class EnglishFragment extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){


        View view = inflater.inflate(R.layout.english_fragment_layout,null);

        Button buttonLetter = view.findViewById(R.id.buttonLetters);
      //  ImageView img_letters = view.findViewById(R.id.imageViewLetters);

        buttonLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Letters_Words_Activity.class);
                startActivity(intent);
            }
        });

        return view;

    }


}



