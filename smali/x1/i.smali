.class public final Lx1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/i$a;
    }
.end annotation


# static fields
.field private static final o:[I

.field private static final p:Lx1/i$a;

.field private static final q:Lx1/i$a;


# instance fields
.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ls1/n1;",
            ">;"
        }
    .end annotation
.end field

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lx1/i;->o:[I

    new-instance v0, Lx1/i$a;

    sget-object v1, Lx1/h;->a:Lx1/h;

    invoke-direct {v0, v1}, Lx1/i$a;-><init>(Lx1/i$a$a;)V

    sput-object v0, Lx1/i;->p:Lx1/i$a;

    new-instance v0, Lx1/i$a;

    sget-object v1, Lx1/g;->a:Lx1/g;

    invoke-direct {v0, v1}, Lx1/i$a;-><init>(Lx1/i$a$a;)V

    sput-object v0, Lx1/i;->q:Lx1/i$a;

    return-void

    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lx1/i;->k:I

    const v0, 0x1b8a0

    iput v0, p0, Lx1/i;->n:I

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Lx1/i;->m:Lcom/google/common/collect/q;

    return-void
.end method

.method public static synthetic c()Ljava/lang/reflect/Constructor;
    .locals 1

    invoke-static {}, Lx1/i;->g()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/reflect/Constructor;
    .locals 1

    invoke-static {}, Lx1/i;->f()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method private e(ILjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lx1/l;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_5

    :pswitch_1
    new-instance p1, Lz1/b;

    invoke-direct {p1}, Lz1/b;-><init>()V

    goto/16 :goto_4

    :pswitch_2
    sget-object p1, Lx1/i;->q:Lx1/i$a;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lx1/i$a;->a([Ljava/lang/Object;)Lx1/l;

    move-result-object p1

    if-eqz p1, :cond_4

    goto/16 :goto_1

    :pswitch_3
    new-instance p1, Lc2/a;

    invoke-direct {p1}, Lc2/a;-><init>()V

    goto/16 :goto_4

    :pswitch_4
    new-instance p1, Li2/b;

    invoke-direct {p1}, Li2/b;-><init>()V

    goto/16 :goto_4

    :pswitch_5
    new-instance p1, Lh2/h0;

    iget v0, p0, Lx1/i;->k:I

    new-instance v1, Lp3/j0;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lp3/j0;-><init>(J)V

    new-instance v2, Lh2/j;

    iget v3, p0, Lx1/i;->l:I

    iget-object v4, p0, Lx1/i;->m:Lcom/google/common/collect/q;

    invoke-direct {v2, v3, v4}, Lh2/j;-><init>(ILjava/util/List;)V

    iget v3, p0, Lx1/i;->n:I

    invoke-direct {p1, v0, v1, v2, v3}, Lh2/h0;-><init>(ILp3/j0;Lh2/i0$c;I)V

    goto/16 :goto_4

    :pswitch_6
    new-instance p1, Lh2/a0;

    invoke-direct {p1}, Lh2/a0;-><init>()V

    goto/16 :goto_4

    :pswitch_7
    new-instance p1, Lg2/d;

    invoke-direct {p1}, Lg2/d;-><init>()V

    goto/16 :goto_4

    :pswitch_8
    new-instance p1, Lf2/g;

    iget v0, p0, Lx1/i;->i:I

    invoke-direct {p1, v0}, Lf2/g;-><init>(I)V

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lf2/k;

    iget v0, p0, Lx1/i;->h:I

    invoke-direct {p1, v0}, Lf2/k;-><init>(I)V

    goto/16 :goto_4

    :pswitch_9
    new-instance p1, Le2/f;

    iget v2, p0, Lx1/i;->j:I

    iget-boolean v3, p0, Lx1/i;->b:Z

    or-int/2addr v2, v3

    iget-boolean v3, p0, Lx1/i;->c:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    or-int/2addr v0, v2

    invoke-direct {p1, v0}, Le2/f;-><init>(I)V

    goto :goto_4

    :pswitch_a
    new-instance p1, Ld2/e;

    iget v0, p0, Lx1/i;->g:I

    invoke-direct {p1, v0}, Ld2/e;-><init>(I)V

    goto :goto_4

    :pswitch_b
    new-instance p1, Lb2/c;

    invoke-direct {p1}, Lb2/c;-><init>()V

    goto :goto_4

    :pswitch_c
    sget-object p1, Lx1/i;->p:Lx1/i$a;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v2, p0, Lx1/i;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p1, v0}, Lx1/i$a;->a([Ljava/lang/Object;)Lx1/l;

    move-result-object p1

    if-eqz p1, :cond_1

    :goto_1
    goto :goto_4

    :cond_1
    new-instance p1, La2/d;

    iget v0, p0, Lx1/i;->f:I

    invoke-direct {p1, v0}, La2/d;-><init>(I)V

    goto :goto_4

    :pswitch_d
    new-instance p1, Ly1/b;

    iget v2, p0, Lx1/i;->e:I

    iget-boolean v3, p0, Lx1/i;->b:Z

    or-int/2addr v2, v3

    iget-boolean v3, p0, Lx1/i;->c:Z

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    or-int/2addr v0, v2

    invoke-direct {p1, v0}, Ly1/b;-><init>(I)V

    goto :goto_4

    :pswitch_e
    new-instance p1, Lh2/h;

    iget v2, p0, Lx1/i;->d:I

    iget-boolean v3, p0, Lx1/i;->b:Z

    or-int/2addr v2, v3

    iget-boolean v3, p0, Lx1/i;->c:Z

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    or-int/2addr v0, v2

    invoke-direct {p1, v0}, Lh2/h;-><init>(I)V

    goto :goto_4

    :pswitch_f
    new-instance p1, Lh2/e;

    invoke-direct {p1}, Lh2/e;-><init>()V

    goto :goto_4

    :pswitch_10
    new-instance p1, Lh2/b;

    invoke-direct {p1}, Lh2/b;-><init>()V

    :goto_4
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static f()Ljava/lang/reflect/Constructor;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lx1/l;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "com.google.android.exoplayer2.ext.flac.FlacLibrary"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    const-string v4, "isAvailable"

    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.google.android.exoplayer2.ext.flac.FlacExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lx1/l;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v4
.end method

.method private static g()Ljava/lang/reflect/Constructor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lx1/l;",
            ">;"
        }
    .end annotation

    const-string v0, "com.google.android.exoplayer2.decoder.midi.MidiExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lx1/l;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()[Lx1/l;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v0, v1}, Lx1/i;->b(Landroid/net/Uri;Ljava/util/Map;)[Lx1/l;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Landroid/net/Uri;Ljava/util/Map;)[Lx1/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Lx1/l;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lx1/i;->o:[I

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p2}, Lp3/k;->b(Ljava/util/Map;)I

    move-result p2

    const/4 v2, -0x1

    if-eq p2, v2, :cond_0

    invoke-direct {p0, p2, v0}, Lx1/i;->e(ILjava/util/List;)V

    :cond_0
    invoke-static {p1}, Lp3/k;->c(Landroid/net/Uri;)I

    move-result p1

    if-eq p1, v2, :cond_1

    if-eq p1, p2, :cond_1

    invoke-direct {p0, p1, v0}, Lx1/i;->e(ILjava/util/List;)V

    :cond_1
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget v4, v1, v3

    if-eq v4, p2, :cond_2

    if-eq v4, p1, :cond_2

    invoke-direct {p0, v4, v0}, Lx1/i;->e(ILjava/util/List;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lx1/l;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lx1/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
