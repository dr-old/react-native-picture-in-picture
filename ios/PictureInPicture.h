
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNPictureInPictureSpec.h"

@interface PictureInPicture : NSObject <NativePictureInPictureSpec>
#else
#import <React/RCTBridgeModule.h>

@interface PictureInPicture : NSObject <RCTBridgeModule>
#endif

@end
