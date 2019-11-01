package com.example.aboutme.databinding;
import com.example.aboutme.R;
import com.example.aboutme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edt_nickname, 3);
        sViewsWithIds.put(R.id.btn_done, 4);
        sViewsWithIds.put(R.id.iv_star, 5);
        sViewsWithIds.put(R.id.sv_profile, 6);
        sViewsWithIds.put(R.id.tv_bio, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myVariable.name
            //         is myVariable.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvName);
            // localize variables for thread safety
            // myVariable != null
            boolean myVariableJavaLangObjectNull = false;
            // myVariable.name
            java.lang.String myVariableName = null;
            // myVariable
            com.example.aboutme.MainActivity.MyName myVariable = mMyVariable;



            myVariableJavaLangObjectNull = (myVariable) != (null);
            if (myVariableJavaLangObjectNull) {




                myVariable.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvNicknameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myVariable.nickName
            //         is myVariable.setNickName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvNickname);
            // localize variables for thread safety
            // myVariable.nickName
            java.lang.String myVariableNickName = null;
            // myVariable != null
            boolean myVariableJavaLangObjectNull = false;
            // myVariable
            com.example.aboutme.MainActivity.MyName myVariable = mMyVariable;



            myVariableJavaLangObjectNull = (myVariable) != (null);
            if (myVariableJavaLangObjectNull) {




                myVariable.setNickName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvNickname.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myVariable == variableId) {
            setMyVariable((com.example.aboutme.MainActivity.MyName) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyVariable(@Nullable com.example.aboutme.MainActivity.MyName MyVariable) {
        this.mMyVariable = MyVariable;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myVariable);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String myVariableNickName = null;
        java.lang.String myVariableName = null;
        com.example.aboutme.MainActivity.MyName myVariable = mMyVariable;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myVariable != null) {
                    // read myVariable.nickName
                    myVariableNickName = myVariable.getNickName();
                    // read myVariable.name
                    myVariableName = myVariable.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, myVariableName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNickname, myVariableNickName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvNickname, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvNicknameandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myVariable
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}