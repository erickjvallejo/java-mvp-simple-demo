package com.erickjvallejo.mvp;

public class ViewImpl implements View {

    private String label;
    private Presenter presenter;

    public ViewImpl() {

    }

    public void initOnlyWithView() {
        presenter = new Presenter(this);
        showProgressBar();
        presenter.updateName("John");
        hideProgressBar();

        showProgressBar();
        presenter.updateLastname("Doe");
        hideProgressBar();

    }


    public void initWithViewAndModel() {
        presenter = new Presenter(this, new Model());
        showProgressBar();
        presenter.updateName("Jane");
        hideProgressBar();

        showProgressBar();
        presenter.updateLastname("Doe");
        hideProgressBar();

    }

    public void updateUserInfoTextView(String user) {
        label = user;
        updateGui();
    }

    private void updateGui() {

        System.out.println(this.label);
    }

    public void showProgressBar() {
        System.out.println("Processing....");

    }

    public void hideProgressBar() {
        System.out.println("Ok!");

    }


}

