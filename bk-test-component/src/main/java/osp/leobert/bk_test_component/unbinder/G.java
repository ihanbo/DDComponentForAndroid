package osp.leobert.bk_test_component.unbinder;

import android.support.annotation.ColorInt;
import android.view.View;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class G extends E {

  @BindColor(android.R.color.darker_gray) @ColorInt
  int grayColor;
  @BindView(android.R.id.button2)
  public View button2;

  public G(View view) {
    super(view);
    ButterKnife.bind(this, view);
  }

  @OnClick(android.R.id.content) public void onClick() {

  }
}