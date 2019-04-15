package com.netflix.conductor.core.utils;

import org.junit.Assert;
import org.junit.Test;

public class QueueUtilsTest {

	@Test
	public void queueNameWithTypeAndIsolationGroup() {

		String queueNameGenerated = QueueUtils.getQueueName("tType", null, "isolationGroup");

		Assert.assertEquals("tType-isolationGroup", queueNameGenerated);
	}

}
