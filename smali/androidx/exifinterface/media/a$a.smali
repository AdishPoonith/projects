.class Landroidx/exifinterface/media/a$a;
.super Landroid/media/MediaDataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/exifinterface/media/a;->f(Landroidx/exifinterface/media/a$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field j:J

.field final synthetic k:Landroidx/exifinterface/media/a$g;

.field final synthetic l:Landroidx/exifinterface/media/a;


# direct methods
.method constructor <init>(Landroidx/exifinterface/media/a;Landroidx/exifinterface/media/a$g;)V
    .locals 0

    iput-object p1, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a;

    iput-object p2, p0, Landroidx/exifinterface/media/a$a;->k:Landroidx/exifinterface/media/a$g;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public getSize()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public readAt(J[BII)I
    .locals 6

    if-nez p5, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide/16 v0, 0x0

    const/4 v2, -0x1

    cmp-long v3, p1, v0

    if-gez v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    iget-wide v3, p0, Landroidx/exifinterface/media/a$a;->j:J

    cmp-long v5, v3, p1

    if-eqz v5, :cond_3

    cmp-long v5, v3, v0

    if-ltz v5, :cond_2

    iget-object v0, p0, Landroidx/exifinterface/media/a$a;->k:Landroidx/exifinterface/media/a$g;

    invoke-virtual {v0}, Landroidx/exifinterface/media/a$b;->available()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v3, v0

    cmp-long v0, p1, v3

    if-ltz v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, Landroidx/exifinterface/media/a$a;->k:Landroidx/exifinterface/media/a$g;

    invoke-virtual {v0, p1, p2}, Landroidx/exifinterface/media/a$g;->i(J)V

    iput-wide p1, p0, Landroidx/exifinterface/media/a$a;->j:J

    :cond_3
    iget-object p1, p0, Landroidx/exifinterface/media/a$a;->k:Landroidx/exifinterface/media/a$g;

    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->available()I

    move-result p1

    if-le p5, p1, :cond_4

    iget-object p1, p0, Landroidx/exifinterface/media/a$a;->k:Landroidx/exifinterface/media/a$g;

    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->available()I

    move-result p5

    :cond_4
    iget-object p1, p0, Landroidx/exifinterface/media/a$a;->k:Landroidx/exifinterface/media/a$g;

    invoke-virtual {p1, p3, p4, p5}, Landroidx/exifinterface/media/a$b;->read([BII)I

    move-result p1

    if-ltz p1, :cond_5

    iget-wide p2, p0, Landroidx/exifinterface/media/a$a;->j:J

    int-to-long p4, p1

    add-long/2addr p2, p4

    iput-wide p2, p0, Landroidx/exifinterface/media/a$a;->j:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_5
    const-wide/16 p1, -0x1

    iput-wide p1, p0, Landroidx/exifinterface/media/a$a;->j:J

    return v2
.end method
