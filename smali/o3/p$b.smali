.class public final Lo3/p$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:J

.field private c:I

.field private d:[B

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:J

.field private g:J

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lo3/p$b;->c:I

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo3/p$b;->e:Ljava/util/Map;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo3/p$b;->g:J

    return-void
.end method

.method private constructor <init>(Lo3/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lo3/p;->a:Landroid/net/Uri;

    iput-object v0, p0, Lo3/p$b;->a:Landroid/net/Uri;

    iget-wide v0, p1, Lo3/p;->b:J

    iput-wide v0, p0, Lo3/p$b;->b:J

    iget v0, p1, Lo3/p;->c:I

    iput v0, p0, Lo3/p$b;->c:I

    iget-object v0, p1, Lo3/p;->d:[B

    iput-object v0, p0, Lo3/p$b;->d:[B

    iget-object v0, p1, Lo3/p;->e:Ljava/util/Map;

    iput-object v0, p0, Lo3/p$b;->e:Ljava/util/Map;

    iget-wide v0, p1, Lo3/p;->g:J

    iput-wide v0, p0, Lo3/p$b;->f:J

    iget-wide v0, p1, Lo3/p;->h:J

    iput-wide v0, p0, Lo3/p$b;->g:J

    iget-object v0, p1, Lo3/p;->i:Ljava/lang/String;

    iput-object v0, p0, Lo3/p$b;->h:Ljava/lang/String;

    iget v0, p1, Lo3/p;->j:I

    iput v0, p0, Lo3/p$b;->i:I

    iget-object p1, p1, Lo3/p;->k:Ljava/lang/Object;

    iput-object p1, p0, Lo3/p$b;->j:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lo3/p;Lo3/p$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo3/p$b;-><init>(Lo3/p;)V

    return-void
.end method


# virtual methods
.method public a()Lo3/p;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lo3/p$b;->a:Landroid/net/Uri;

    const-string v2, "The uri must be set."

    invoke-static {v1, v2}, Lp3/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lo3/p;

    iget-object v4, v0, Lo3/p$b;->a:Landroid/net/Uri;

    iget-wide v5, v0, Lo3/p$b;->b:J

    iget v7, v0, Lo3/p$b;->c:I

    iget-object v8, v0, Lo3/p$b;->d:[B

    iget-object v9, v0, Lo3/p$b;->e:Ljava/util/Map;

    iget-wide v10, v0, Lo3/p$b;->f:J

    iget-wide v12, v0, Lo3/p$b;->g:J

    iget-object v14, v0, Lo3/p$b;->h:Ljava/lang/String;

    iget v15, v0, Lo3/p$b;->i:I

    iget-object v2, v0, Lo3/p$b;->j:Ljava/lang/Object;

    const/16 v17, 0x0

    move-object v3, v1

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Lo3/p;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;Lo3/p$a;)V

    return-object v1
.end method

.method public b(I)Lo3/p$b;
    .locals 0

    iput p1, p0, Lo3/p$b;->i:I

    return-object p0
.end method

.method public c([B)Lo3/p$b;
    .locals 0

    iput-object p1, p0, Lo3/p$b;->d:[B

    return-object p0
.end method

.method public d(I)Lo3/p$b;
    .locals 0

    iput p1, p0, Lo3/p$b;->c:I

    return-object p0
.end method

.method public e(Ljava/util/Map;)Lo3/p$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lo3/p$b;"
        }
    .end annotation

    iput-object p1, p0, Lo3/p$b;->e:Ljava/util/Map;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lo3/p$b;
    .locals 0

    iput-object p1, p0, Lo3/p$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public g(J)Lo3/p$b;
    .locals 0

    iput-wide p1, p0, Lo3/p$b;->g:J

    return-object p0
.end method

.method public h(J)Lo3/p$b;
    .locals 0

    iput-wide p1, p0, Lo3/p$b;->f:J

    return-object p0
.end method

.method public i(Landroid/net/Uri;)Lo3/p$b;
    .locals 0

    iput-object p1, p0, Lo3/p$b;->a:Landroid/net/Uri;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lo3/p$b;
    .locals 0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lo3/p$b;->a:Landroid/net/Uri;

    return-object p0
.end method
