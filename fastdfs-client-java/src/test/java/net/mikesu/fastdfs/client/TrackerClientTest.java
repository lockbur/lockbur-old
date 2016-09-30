package net.mikesu.fastdfs.client;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import net.mikesu.fastdfs.data.GroupInfo;
import net.mikesu.fastdfs.data.Result;
import net.mikesu.fastdfs.data.UploadStorage;

import org.junit.Test;

public class TrackerClientTest {

	@Test
	public void testGetUploadStorageAddr() throws NumberFormatException, UnknownHostException, IOException {
		TrackerClient trackerClient = new TrackerClientImpl("192.168.201.128:22122");
		Result<UploadStorage> result = trackerClient.getUploadStorage();
		assertEquals(0, result.getCode());
		assertEquals("192.168.201.128:23000",result.getData().getAddress());
		trackerClient.close();
	}
	
	@Test
	public void testGetDownloadStorageAddr() throws IOException {
		TrackerClient trackerClient = new TrackerClientImpl("192.168.201.128:22122");
		Result<String> result = trackerClient.getDownloadStorageAddr("group1","M00/00/00/wKjJgFXN8QCAEafHAABKpvxEDvg733_big.png");
		assertEquals(0, result.getCode());
                System.out.println("result "+result.getCode());
                  System.out.println("result "+result.getData());
		assertEquals("192.168.201.128:23000",result.getData());
		trackerClient.close();
	}
	
	@Test
	public void testGetUpdateStorageAddr() throws IOException {
		TrackerClient trackerClient = new TrackerClientImpl("192.168.201.128:22122");
		Result<String> result = trackerClient.getUpdateStorageAddr("group1","M00/00/00/wKjJgFXN8QCAEafHAABKpvxEDvg733_big.png");
		assertEquals(0, result.getCode());
		assertEquals("192.168.201.128:23000",result.getData());
		trackerClient.close();
	}
	
	@Test
	public void testGetGroupInfos() throws NumberFormatException, UnknownHostException, IOException{
		TrackerClient trackerClient = new TrackerClientImpl("192.168.201.128:22122");
		Result<List<GroupInfo>> groupInfos = trackerClient.getGroupInfos();
		assertNotNull(groupInfos);
		trackerClient.close();
	}
}
