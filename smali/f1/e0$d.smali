.class final Lf1/e0$d;
.super Lf1/e0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf1/e0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf1/e0$d;->g()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.orca"

    return-object v0
.end method

.method public g()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
