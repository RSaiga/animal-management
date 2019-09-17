package com.lib.training;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Component
public class Version implements InitializingBean {
  private String version;

  @Override
  public void afterPropertiesSet() throws Exception {
    DefaultResourceLoader loader = new DefaultResourceLoader();
    Resource resource = loader.getResource("classpath:/version");
    try (InputStream is = resource.getInputStream(); ByteArrayOutputStream os = new ByteArrayOutputStream()) {
      byte[] buf = new byte[8192];
      int len = 0;
      while (0 < (len = is.read(buf))) {
        os.write(buf, 0, len);
      }
      version = new String(os.toByteArray(), StandardCharsets.UTF_8);
    }
  }

  public String getVersion() {
    return version;
  }
}
