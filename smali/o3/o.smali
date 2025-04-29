.class public final Lo3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lo3/l;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Lo3/l;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
