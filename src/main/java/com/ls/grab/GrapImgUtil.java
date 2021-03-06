package com.ls.grab;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import com.ls.constants.HanthinkProperties;

public class GrapImgUtil {

	public static void main(String[] args) {

		String url = "http://image.58.com/showphone.aspx?t=v55&v=1B400043779E683A84EC016A68A606B3549FA927C514F63F";
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1) Gecko/20070803 Firefox/1.5.0.12");
		request.addHeader("Content-Type", " text/html;charset=UTF-8");

		try {
			HttpResponse response = client.execute(request);

			String name = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
			File storeFile = new File("D:\\Jerry\\" + name + ".jpg");

			if (!storeFile.exists()) {
				storeFile.createNewFile();
			}

			FileOutputStream fileOutputStream = new FileOutputStream(storeFile);

			// InputStreamReader inputStreamReader = new
			// InputStreamReader(response.getEntity().getContent(), "UTF-8");
			InputStream inputStream = response.getEntity().getContent();

			IOUtils.copy(response.getEntity().getContent(), fileOutputStream);

			IOUtils.closeQuietly(inputStream);
			IOUtils.closeQuietly(fileOutputStream);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized String grabImgWithSrc(String imgSrc, String cookies) {

		HttpClient client = HttpClientBuilder.create().build();

		HttpGet request = new HttpGet(imgSrc);

		request.addHeader(new BasicHeader("Cookie", cookies + "; login_entCode=shcmmy; login_userName=admin; ENT_CUSTOMIZATION=default_ent"));

		try {

			HttpResponse response = client.execute(request);

			String name = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

			File storeFile = new File(HanthinkProperties.getString("tessertOcrInstallPath") + name + ".jpg");

			if (!storeFile.exists()) {
				storeFile.createNewFile();
			}

			FileOutputStream fileOutputStream = new FileOutputStream(storeFile);

			InputStream inputStream = response.getEntity().getContent();

			IOUtils.copy(response.getEntity().getContent(), fileOutputStream);

			IOUtils.closeQuietly(inputStream);
			IOUtils.closeQuietly(fileOutputStream);

			return name;

		} catch (IOException e) {
			e.printStackTrace();
			return "fail";
		}
	}

}
