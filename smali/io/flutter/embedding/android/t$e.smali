.class public Lio/flutter/embedding/android/t$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J

.field public d:Z


# direct methods
.method public constructor <init>(IJJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/embedding/android/t$e;->d:Z

    iput p1, p0, Lio/flutter/embedding/android/t$e;->a:I

    iput-wide p2, p0, Lio/flutter/embedding/android/t$e;->b:J

    iput-wide p4, p0, Lio/flutter/embedding/android/t$e;->c:J

    return-void
.end method
