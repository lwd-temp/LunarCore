// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChallengeOuterClass {
  /**
   * Protobuf type {@code Challenge}
   */
  public static final class Challenge extends ProtoMessage<Challenge> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 stars = 10;</code>
     */
    private int stars;

    /**
     * <code>optional uint32 challenge_id = 13;</code>
     */
    private int challengeId;

    /**
     * <code>optional uint32 taken_reward = 14;</code>
     */
    private int takenReward;

    private Challenge() {
    }

    /**
     * @return a new empty instance of {@code Challenge}
     */
    public static Challenge newInstance() {
      return new Challenge();
    }

    /**
     * <code>optional uint32 stars = 10;</code>
     * @return whether the stars field is set
     */
    public boolean hasStars() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 stars = 10;</code>
     * @return this
     */
    public Challenge clearStars() {
      bitField0_ &= ~0x00000001;
      stars = 0;
      return this;
    }

    /**
     * <code>optional uint32 stars = 10;</code>
     * @return the stars
     */
    public int getStars() {
      return stars;
    }

    /**
     * <code>optional uint32 stars = 10;</code>
     * @param value the stars to set
     * @return this
     */
    public Challenge setStars(final int value) {
      bitField0_ |= 0x00000001;
      stars = value;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 13;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 13;</code>
     * @return this
     */
    public Challenge clearChallengeId() {
      bitField0_ &= ~0x00000002;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 13;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 13;</code>
     * @param value the challengeId to set
     * @return this
     */
    public Challenge setChallengeId(final int value) {
      bitField0_ |= 0x00000002;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional uint32 taken_reward = 14;</code>
     * @return whether the takenReward field is set
     */
    public boolean hasTakenReward() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 taken_reward = 14;</code>
     * @return this
     */
    public Challenge clearTakenReward() {
      bitField0_ &= ~0x00000004;
      takenReward = 0;
      return this;
    }

    /**
     * <code>optional uint32 taken_reward = 14;</code>
     * @return the takenReward
     */
    public int getTakenReward() {
      return takenReward;
    }

    /**
     * <code>optional uint32 taken_reward = 14;</code>
     * @param value the takenReward to set
     * @return this
     */
    public Challenge setTakenReward(final int value) {
      bitField0_ |= 0x00000004;
      takenReward = value;
      return this;
    }

    @Override
    public Challenge copyFrom(final Challenge other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        stars = other.stars;
        challengeId = other.challengeId;
        takenReward = other.takenReward;
      }
      return this;
    }

    @Override
    public Challenge mergeFrom(final Challenge other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStars()) {
        setStars(other.stars);
      }
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasTakenReward()) {
        setTakenReward(other.takenReward);
      }
      return this;
    }

    @Override
    public Challenge clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      stars = 0;
      challengeId = 0;
      takenReward = 0;
      return this;
    }

    @Override
    public Challenge clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Challenge)) {
        return false;
      }
      Challenge other = (Challenge) o;
      return bitField0_ == other.bitField0_
        && (!hasStars() || stars == other.stars)
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasTakenReward() || takenReward == other.takenReward);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(stars);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(takenReward);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stars);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(takenReward);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Challenge mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // stars
            stars = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // takenReward
            takenReward = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.stars, stars);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.takenReward, takenReward);
      }
      output.endObject();
    }

    @Override
    public Challenge mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109757537: {
            if (input.isAtField(FieldNames.stars)) {
              if (!input.trySkipNullValue()) {
                stars = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1216849622:
          case -1923526233: {
            if (input.isAtField(FieldNames.takenReward)) {
              if (!input.trySkipNullValue()) {
                takenReward = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public Challenge clone() {
      return new Challenge().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Challenge parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Challenge(), data).checkInitialized();
    }

    public static Challenge parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Challenge(), input).checkInitialized();
    }

    public static Challenge parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Challenge(), input).checkInitialized();
    }

    /**
     * @return factory for creating Challenge messages
     */
    public static MessageFactory<Challenge> getFactory() {
      return ChallengeFactory.INSTANCE;
    }

    private enum ChallengeFactory implements MessageFactory<Challenge> {
      INSTANCE;

      @Override
      public Challenge create() {
        return Challenge.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName stars = FieldName.forField("stars");

      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName takenReward = FieldName.forField("takenReward", "taken_reward");
    }
  }
}
