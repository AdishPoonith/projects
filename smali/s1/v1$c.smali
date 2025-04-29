.class public final Ls1/v1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private d:Ls1/v1$d$a;

.field private e:Ls1/v1$f$a;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt2/c;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ls1/v1$l;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/Object;

.field private j:Ls1/a2;

.field private k:Ls1/v1$g$a;

.field private l:Ls1/v1$j;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls1/v1$d$a;

    invoke-direct {v0}, Ls1/v1$d$a;-><init>()V

    iput-object v0, p0, Ls1/v1$c;->d:Ls1/v1$d$a;

    new-instance v0, Ls1/v1$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls1/v1$f$a;-><init>(Ls1/v1$a;)V

    iput-object v0, p0, Ls1/v1$c;->e:Ls1/v1$f$a;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ls1/v1$c;->f:Ljava/util/List;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ls1/v1$c;->h:Lcom/google/common/collect/q;

    new-instance v0, Ls1/v1$g$a;

    invoke-direct {v0}, Ls1/v1$g$a;-><init>()V

    iput-object v0, p0, Ls1/v1$c;->k:Ls1/v1$g$a;

    sget-object v0, Ls1/v1$j;->m:Ls1/v1$j;

    iput-object v0, p0, Ls1/v1$c;->l:Ls1/v1$j;

    return-void
.end method

.method private constructor <init>(Ls1/v1;)V
    .locals 1

    invoke-direct {p0}, Ls1/v1$c;-><init>()V

    iget-object v0, p1, Ls1/v1;->o:Ls1/v1$d;

    invoke-virtual {v0}, Ls1/v1$d;->b()Ls1/v1$d$a;

    move-result-object v0

    iput-object v0, p0, Ls1/v1$c;->d:Ls1/v1$d$a;

    iget-object v0, p1, Ls1/v1;->j:Ljava/lang/String;

    iput-object v0, p0, Ls1/v1$c;->a:Ljava/lang/String;

    iget-object v0, p1, Ls1/v1;->n:Ls1/a2;

    iput-object v0, p0, Ls1/v1$c;->j:Ls1/a2;

    iget-object v0, p1, Ls1/v1;->m:Ls1/v1$g;

    invoke-virtual {v0}, Ls1/v1$g;->b()Ls1/v1$g$a;

    move-result-object v0

    iput-object v0, p0, Ls1/v1$c;->k:Ls1/v1$g$a;

    iget-object v0, p1, Ls1/v1;->q:Ls1/v1$j;

    iput-object v0, p0, Ls1/v1$c;->l:Ls1/v1$j;

    iget-object p1, p1, Ls1/v1;->k:Ls1/v1$h;

    if-eqz p1, :cond_1

    iget-object v0, p1, Ls1/v1$h;->e:Ljava/lang/String;

    iput-object v0, p0, Ls1/v1$c;->g:Ljava/lang/String;

    iget-object v0, p1, Ls1/v1$h;->b:Ljava/lang/String;

    iput-object v0, p0, Ls1/v1$c;->c:Ljava/lang/String;

    iget-object v0, p1, Ls1/v1$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Ls1/v1$c;->b:Landroid/net/Uri;

    iget-object v0, p1, Ls1/v1$h;->d:Ljava/util/List;

    iput-object v0, p0, Ls1/v1$c;->f:Ljava/util/List;

    iget-object v0, p1, Ls1/v1$h;->f:Lcom/google/common/collect/q;

    iput-object v0, p0, Ls1/v1$c;->h:Lcom/google/common/collect/q;

    iget-object v0, p1, Ls1/v1$h;->h:Ljava/lang/Object;

    iput-object v0, p0, Ls1/v1$c;->i:Ljava/lang/Object;

    iget-object p1, p1, Ls1/v1$h;->c:Ls1/v1$f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ls1/v1$f;->b()Ls1/v1$f$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ls1/v1$f$a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ls1/v1$f$a;-><init>(Ls1/v1$a;)V

    :goto_0
    iput-object p1, p0, Ls1/v1$c;->e:Ls1/v1$f$a;

    :cond_1
    return-void
.end method

.method synthetic constructor <init>(Ls1/v1;Ls1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/v1$c;-><init>(Ls1/v1;)V

    return-void
.end method


# virtual methods
.method public a()Ls1/v1;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Ls1/v1$c;->e:Ls1/v1$f$a;

    invoke-static {v1}, Ls1/v1$f$a;->e(Ls1/v1$f$a;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ls1/v1$c;->e:Ls1/v1$f$a;

    invoke-static {v1}, Ls1/v1$f$a;->f(Ls1/v1$f$a;)Ljava/util/UUID;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lp3/a;->f(Z)V

    iget-object v3, v0, Ls1/v1$c;->b:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz v3, :cond_3

    new-instance v12, Ls1/v1$i;

    iget-object v4, v0, Ls1/v1$c;->c:Ljava/lang/String;

    iget-object v2, v0, Ls1/v1$c;->e:Ls1/v1$f$a;

    invoke-static {v2}, Ls1/v1$f$a;->f(Ls1/v1$f$a;)Ljava/util/UUID;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v0, Ls1/v1$c;->e:Ls1/v1$f$a;

    invoke-virtual {v1}, Ls1/v1$f$a;->i()Ls1/v1$f;

    move-result-object v1

    :cond_2
    move-object v5, v1

    const/4 v6, 0x0

    iget-object v7, v0, Ls1/v1$c;->f:Ljava/util/List;

    iget-object v8, v0, Ls1/v1$c;->g:Ljava/lang/String;

    iget-object v9, v0, Ls1/v1$c;->h:Lcom/google/common/collect/q;

    iget-object v10, v0, Ls1/v1$c;->i:Ljava/lang/Object;

    const/4 v11, 0x0

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Ls1/v1$i;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls1/v1$f;Ls1/v1$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/q;Ljava/lang/Object;Ls1/v1$a;)V

    move-object/from16 v16, v12

    goto :goto_2

    :cond_3
    move-object/from16 v16, v1

    :goto_2
    new-instance v1, Ls1/v1;

    iget-object v2, v0, Ls1/v1$c;->a:Ljava/lang/String;

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const-string v2, ""

    :goto_3
    move-object v14, v2

    iget-object v2, v0, Ls1/v1$c;->d:Ls1/v1$d$a;

    invoke-virtual {v2}, Ls1/v1$d$a;->g()Ls1/v1$e;

    move-result-object v15

    iget-object v2, v0, Ls1/v1$c;->k:Ls1/v1$g$a;

    invoke-virtual {v2}, Ls1/v1$g$a;->f()Ls1/v1$g;

    move-result-object v17

    iget-object v2, v0, Ls1/v1$c;->j:Ls1/a2;

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    sget-object v2, Ls1/a2;->R:Ls1/a2;

    :goto_4
    move-object/from16 v18, v2

    iget-object v2, v0, Ls1/v1$c;->l:Ls1/v1$j;

    const/16 v20, 0x0

    move-object v13, v1

    move-object/from16 v19, v2

    invoke-direct/range {v13 .. v20}, Ls1/v1;-><init>(Ljava/lang/String;Ls1/v1$e;Ls1/v1$i;Ls1/v1$g;Ls1/a2;Ls1/v1$j;Ls1/v1$a;)V

    return-object v1
.end method

.method public b(Ljava/lang/String;)Ls1/v1$c;
    .locals 0

    iput-object p1, p0, Ls1/v1$c;->g:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Ls1/v1$c;
    .locals 0

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ls1/v1$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/Object;)Ls1/v1$c;
    .locals 0

    iput-object p1, p0, Ls1/v1$c;->i:Ljava/lang/Object;

    return-object p0
.end method

.method public e(Landroid/net/Uri;)Ls1/v1$c;
    .locals 0

    iput-object p1, p0, Ls1/v1$c;->b:Landroid/net/Uri;

    return-object p0
.end method
