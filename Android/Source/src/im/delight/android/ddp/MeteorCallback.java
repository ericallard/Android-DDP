package im.delight.android.ddp;

/**
 * Copyright 2014 www.delight.im <info@delight.im>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/** Callback for asynchronous events caused by the WebSocket connection or received from the DDP server */
public interface MeteorCallback {

	public void onConnect();
	public void onDisconnect(int code, String reason);
	public void onDataAdded(String collectionName, String documentID, String newValuesJson);
	public void onDataChanged(String collectionName, String documentID, String updatedValuesJson, String removedValuesJson);
	public void onDataRemoved(String collectionName, String documentID);
	public void onException(Exception e);

}
