.class public Lo3/a0;
.super Lo3/m;
.source "SourceFile"


# instance fields
.field public final k:Lo3/p;

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lo3/p;II)V
    .locals 0

    invoke-static {p3, p4}, Lo3/a0;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lo3/m;-><init>(Ljava/lang/Throwable;I)V

    iput-object p2, p0, Lo3/a0;->k:Lo3/p;

    iput p4, p0, Lo3/a0;->l:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lo3/p;II)V
    .locals 0

    invoke-static {p4, p5}, Lo3/a0;->b(II)I

    move-result p4

    invoke-direct {p0, p1, p2, p4}, Lo3/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    iput-object p3, p0, Lo3/a0;->k:Lo3/p;

    iput p5, p0, Lo3/a0;->l:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo3/p;II)V
    .locals 0

    invoke-static {p3, p4}, Lo3/a0;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lo3/m;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Lo3/a0;->k:Lo3/p;

    iput p4, p0, Lo3/a0;->l:I

    return-void
.end method

.method public constructor <init>(Lo3/p;II)V
    .locals 0

    invoke-static {p2, p3}, Lo3/a0;->b(II)I

    move-result p2

    invoke-direct {p0, p2}, Lo3/m;-><init>(I)V

    iput-object p1, p0, Lo3/a0;->k:Lo3/p;

    iput p3, p0, Lo3/a0;->l:I

    return-void
.end method

.method private static b(II)I
    .locals 1

    const/16 v0, 0x7d0

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/16 p0, 0x7d1

    :cond_0
    return p0
.end method

.method public static c(Ljava/io/IOException;Lo3/p;I)Lo3/a0;
    .locals 3

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    const/16 v2, 0x7d7

    if-eqz v1, :cond_0

    const/16 v0, 0x7d2

    goto :goto_0

    :cond_0
    instance-of v1, p0, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_1

    const/16 v0, 0x3ec

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-static {v0}, Lb5/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "cleartext.*not permitted.*"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x7d7

    goto :goto_0

    :cond_2
    const/16 v0, 0x7d1

    :goto_0
    if-ne v0, v2, :cond_3

    new-instance p2, Lo3/z;

    invoke-direct {p2, p0, p1}, Lo3/z;-><init>(Ljava/io/IOException;Lo3/p;)V

    goto :goto_1

    :cond_3
    new-instance v1, Lo3/a0;

    invoke-direct {v1, p0, p1, v0, p2}, Lo3/a0;-><init>(Ljava/io/IOException;Lo3/p;II)V

    move-object p2, v1

    :goto_1
    return-object p2
.end method
