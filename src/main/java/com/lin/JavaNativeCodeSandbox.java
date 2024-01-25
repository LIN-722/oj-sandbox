package com.lin;

import com.lin.model.ExecuteCodeRequest;
import com.lin.model.ExecuteCodeResponse;
import com.lin.model.ExecuteMessage;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }

    @Override
    public File saveCodeToFile(String code) {
        return super.saveCodeToFile(code);
    }
}
