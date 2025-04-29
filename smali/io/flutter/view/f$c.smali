.class Lio/flutter/view/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private j:J

.field final synthetic k:Lio/flutter/view/f;


# direct methods
.method constructor <init>(Lio/flutter/view/f;J)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/f$c;->k:Lio/flutter/view/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lio/flutter/view/f$c;->j:J

    return-void
.end method

.method static synthetic a(Lio/flutter/view/f$c;J)J
    .locals 0

    iput-wide p1, p0, Lio/flutter/view/f$c;->j:J

    return-wide p1
.end method


# virtual methods
.method public doFrame(J)V
    .locals 10

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/16 p1, 0x0

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    move-wide v4, p1

    goto :goto_0

    :cond_0
    move-wide v4, v0

    :goto_0
    iget-object p1, p0, Lio/flutter/view/f$c;->k:Lio/flutter/view/f;

    invoke-static {p1}, Lio/flutter/view/f;->c(Lio/flutter/view/f;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v3

    iget-object p1, p0, Lio/flutter/view/f$c;->k:Lio/flutter/view/f;

    invoke-static {p1}, Lio/flutter/view/f;->a(Lio/flutter/view/f;)J

    move-result-wide v6

    iget-wide v8, p0, Lio/flutter/view/f$c;->j:J

    invoke-virtual/range {v3 .. v9}, Lio/flutter/embedding/engine/FlutterJNI;->onVsync(JJJ)V

    iget-object p1, p0, Lio/flutter/view/f$c;->k:Lio/flutter/view/f;

    invoke-static {p1, p0}, Lio/flutter/view/f;->e(Lio/flutter/view/f;Lio/flutter/view/f$c;)Lio/flutter/view/f$c;

    return-void
.end method
