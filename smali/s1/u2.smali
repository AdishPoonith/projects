.class public Ls1/u2;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final j:Z

.field public final k:I


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean p3, p0, Ls1/u2;->j:Z

    iput p4, p0, Ls1/u2;->k:I

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;
    .locals 2

    new-instance v0, Ls1/u2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1, v1}, Ls1/u2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;
    .locals 3

    new-instance v0, Ls1/u2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Ls1/u2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;
    .locals 3

    new-instance v0, Ls1/u2;

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-direct {v0, p0, p1, v1, v2}, Ls1/u2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ls1/u2;
    .locals 4

    new-instance v0, Ls1/u2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Ls1/u2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method
