.class public final Lu1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/c0$c;,
        Lu1/c0$b;,
        Lu1/c0$d;,
        Lu1/c0$k;,
        Lu1/c0$g;,
        Lu1/c0$l;,
        Lu1/c0$j;,
        Lu1/c0$m;,
        Lu1/c0$f;,
        Lu1/c0$e;,
        Lu1/c0$h;,
        Lu1/c0$i;
    }
.end annotation


# static fields
.field public static e0:Z = false

.field private static final f0:Ljava/lang/Object;

.field private static g0:Ljava/util/concurrent/ExecutorService;

.field private static h0:I


# instance fields
.field private A:Ljava/nio/ByteBuffer;

.field private B:I

.field private C:J

.field private D:J

.field private E:J

.field private F:J

.field private G:I

.field private H:Z

.field private I:Z

.field private J:J

.field private K:F

.field private L:[Lu1/g;

.field private M:[Ljava/nio/ByteBuffer;

.field private N:Ljava/nio/ByteBuffer;

.field private O:I

.field private P:Ljava/nio/ByteBuffer;

.field private Q:[B

.field private R:I

.field private S:I

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Z

.field private X:I

.field private Y:Lu1/y;

.field private Z:Lu1/c0$d;

.field private final a:Lu1/f;

.field private a0:Z

.field private final b:Lu1/h;

.field private b0:J

.field private final c:Z

.field private c0:Z

.field private final d:Lu1/a0;

.field private d0:Z

.field private final e:Lu1/n0;

.field private final f:[Lu1/g;

.field private final g:[Lu1/g;

.field private final h:Lp3/g;

.field private final i:Lu1/x;

.field private final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lu1/c0$j;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Z

.field private final l:I

.field private m:Lu1/c0$m;

.field private final n:Lu1/c0$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu1/c0$k<",
            "Lu1/v$b;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lu1/c0$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu1/c0$k<",
            "Lu1/v$e;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lu1/c0$e;

.field private final q:Ls1/s$a;

.field private r:Lt1/t1;

.field private s:Lu1/v$c;

.field private t:Lu1/c0$g;

.field private u:Lu1/c0$g;

.field private v:Landroid/media/AudioTrack;

.field private w:Lu1/e;

.field private x:Lu1/c0$j;

.field private y:Lu1/c0$j;

.field private z:Ls1/b3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu1/c0;->f0:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lu1/c0$f;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu1/c0$f;->a(Lu1/c0$f;)Lu1/f;

    move-result-object v0

    iput-object v0, p0, Lu1/c0;->a:Lu1/f;

    invoke-static {p1}, Lu1/c0$f;->b(Lu1/c0$f;)Lu1/h;

    move-result-object v0

    iput-object v0, p0, Lu1/c0;->b:Lu1/h;

    sget v1, Lp3/n0;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x15

    if-lt v1, v4, :cond_0

    invoke-static {p1}, Lu1/c0$f;->c(Lu1/c0$f;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, p0, Lu1/c0;->c:Z

    const/16 v4, 0x17

    if-lt v1, v4, :cond_1

    invoke-static {p1}, Lu1/c0$f;->d(Lu1/c0$f;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iput-boolean v4, p0, Lu1/c0;->k:Z

    const/16 v4, 0x1d

    if-lt v1, v4, :cond_2

    invoke-static {p1}, Lu1/c0$f;->e(Lu1/c0$f;)I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    iput v1, p0, Lu1/c0;->l:I

    iget-object v1, p1, Lu1/c0$f;->f:Lu1/c0$e;

    iput-object v1, p0, Lu1/c0;->p:Lu1/c0$e;

    new-instance v1, Lp3/g;

    sget-object v4, Lp3/d;->a:Lp3/d;

    invoke-direct {v1, v4}, Lp3/g;-><init>(Lp3/d;)V

    iput-object v1, p0, Lu1/c0;->h:Lp3/g;

    invoke-virtual {v1}, Lp3/g;->e()Z

    new-instance v1, Lu1/x;

    new-instance v4, Lu1/c0$l;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lu1/c0$l;-><init>(Lu1/c0;Lu1/c0$a;)V

    invoke-direct {v1, v4}, Lu1/x;-><init>(Lu1/x$a;)V

    iput-object v1, p0, Lu1/c0;->i:Lu1/x;

    new-instance v1, Lu1/a0;

    invoke-direct {v1}, Lu1/a0;-><init>()V

    iput-object v1, p0, Lu1/c0;->d:Lu1/a0;

    new-instance v4, Lu1/n0;

    invoke-direct {v4}, Lu1/n0;-><init>()V

    iput-object v4, p0, Lu1/c0;->e:Lu1/n0;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x3

    new-array v6, v6, [Lu1/z;

    new-instance v7, Lu1/j0;

    invoke-direct {v7}, Lu1/j0;-><init>()V

    aput-object v7, v6, v3

    aput-object v1, v6, v2

    const/4 v1, 0x2

    aput-object v4, v6, v1

    invoke-static {v5, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-interface {v0}, Lu1/h;->d()[Lu1/g;

    move-result-object v0

    invoke-static {v5, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    new-array v0, v3, [Lu1/g;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu1/g;

    iput-object v0, p0, Lu1/c0;->f:[Lu1/g;

    new-array v0, v2, [Lu1/g;

    new-instance v1, Lu1/f0;

    invoke-direct {v1}, Lu1/f0;-><init>()V

    aput-object v1, v0, v3

    iput-object v0, p0, Lu1/c0;->g:[Lu1/g;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lu1/c0;->K:F

    sget-object v0, Lu1/e;->p:Lu1/e;

    iput-object v0, p0, Lu1/c0;->w:Lu1/e;

    iput v3, p0, Lu1/c0;->X:I

    new-instance v0, Lu1/y;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Lu1/y;-><init>(IF)V

    iput-object v0, p0, Lu1/c0;->Y:Lu1/y;

    new-instance v0, Lu1/c0$j;

    sget-object v1, Ls1/b3;->m:Ls1/b3;

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v4, v0

    move-object v5, v1

    invoke-direct/range {v4 .. v11}, Lu1/c0$j;-><init>(Ls1/b3;ZJJLu1/c0$a;)V

    iput-object v0, p0, Lu1/c0;->y:Lu1/c0$j;

    iput-object v1, p0, Lu1/c0;->z:Ls1/b3;

    const/4 v0, -0x1

    iput v0, p0, Lu1/c0;->S:I

    new-array v0, v3, [Lu1/g;

    iput-object v0, p0, Lu1/c0;->L:[Lu1/g;

    new-array v0, v3, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/c0;->M:[Ljava/nio/ByteBuffer;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    new-instance v0, Lu1/c0$k;

    const-wide/16 v1, 0x64

    invoke-direct {v0, v1, v2}, Lu1/c0$k;-><init>(J)V

    iput-object v0, p0, Lu1/c0;->n:Lu1/c0$k;

    new-instance v0, Lu1/c0$k;

    invoke-direct {v0, v1, v2}, Lu1/c0$k;-><init>(J)V

    iput-object v0, p0, Lu1/c0;->o:Lu1/c0$k;

    iget-object p1, p1, Lu1/c0$f;->g:Ls1/s$a;

    iput-object p1, p0, Lu1/c0;->q:Ls1/s$a;

    return-void
.end method

.method synthetic constructor <init>(Lu1/c0$f;Lu1/c0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu1/c0;-><init>(Lu1/c0$f;)V

    return-void
.end method

.method static synthetic A(Lu1/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lu1/c0;->V:Z

    return p0
.end method

.method static synthetic B(Lu1/c0;)J
    .locals 2

    invoke-direct {p0}, Lu1/c0;->V()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic C(Lu1/c0;)J
    .locals 2

    invoke-direct {p0}, Lu1/c0;->W()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic D(Lu1/c0;)J
    .locals 2

    iget-wide v0, p0, Lu1/c0;->b0:J

    return-wide v0
.end method

.method static synthetic E(III)Landroid/media/AudioFormat;
    .locals 0

    invoke-static {p0, p1, p2}, Lu1/c0;->O(III)Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method static synthetic F(Lu1/c0;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    return-object p0
.end method

.method static synthetic G(Lu1/c0;)Lu1/v$c;
    .locals 0

    iget-object p0, p0, Lu1/c0;->s:Lu1/v$c;

    return-object p0
.end method

.method private H(J)V
    .locals 11

    invoke-direct {p0}, Lu1/c0;->o0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->b:Lu1/h;

    invoke-direct {p0}, Lu1/c0;->P()Ls1/b3;

    move-result-object v1

    invoke-interface {v0, v1}, Lu1/h;->e(Ls1/b3;)Ls1/b3;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ls1/b3;->m:Ls1/b3;

    :goto_0
    move-object v2, v0

    invoke-direct {p0}, Lu1/c0;->o0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/c0;->b:Lu1/h;

    invoke-virtual {p0}, Lu1/c0;->U()Z

    move-result v1

    invoke-interface {v0, v1}, Lu1/h;->b(Z)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v9, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    new-instance v10, Lu1/c0$j;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object p1, p0, Lu1/c0;->u:Lu1/c0$g;

    invoke-direct {p0}, Lu1/c0;->W()J

    move-result-wide v6

    invoke-virtual {p1, v6, v7}, Lu1/c0$g;->h(J)J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v1, v10

    move v3, v0

    invoke-direct/range {v1 .. v8}, Lu1/c0$j;-><init>(Ls1/b3;ZJJLu1/c0$a;)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lu1/c0;->n0()V

    iget-object p1, p0, Lu1/c0;->s:Lu1/v$c;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lu1/v$c;->b(Z)V

    :cond_2
    return-void
.end method

.method private I(J)J
    .locals 4

    :goto_0
    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/c0$j;

    iget-wide v0, v0, Lu1/c0$j;->d:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/c0$j;

    iput-object v0, p0, Lu1/c0;->y:Lu1/c0$j;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/c0;->y:Lu1/c0$j;

    iget-wide v1, v0, Lu1/c0$j;->d:J

    sub-long v1, p1, v1

    iget-object v0, v0, Lu1/c0$j;->a:Ls1/b3;

    sget-object v3, Ls1/b3;->m:Ls1/b3;

    invoke-virtual {v0, v3}, Ls1/b3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lu1/c0;->y:Lu1/c0$j;

    iget-wide p1, p1, Lu1/c0$j;->c:J

    add-long/2addr p1, v1

    return-wide p1

    :cond_1
    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lu1/c0;->b:Lu1/h;

    invoke-interface {p1, v1, v2}, Lu1/h;->c(J)J

    move-result-wide p1

    iget-object v0, p0, Lu1/c0;->y:Lu1/c0$j;

    iget-wide v0, v0, Lu1/c0$j;->c:J

    add-long/2addr v0, p1

    return-wide v0

    :cond_2
    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/c0$j;

    iget-wide v1, v0, Lu1/c0$j;->d:J

    sub-long/2addr v1, p1

    iget-object p1, p0, Lu1/c0;->y:Lu1/c0$j;

    iget-object p1, p1, Lu1/c0$j;->a:Ls1/b3;

    iget p1, p1, Ls1/b3;->j:F

    invoke-static {v1, v2, p1}, Lp3/n0;->Z(JF)J

    move-result-wide p1

    iget-wide v0, v0, Lu1/c0$j;->c:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method private J(J)J
    .locals 3

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget-object v1, p0, Lu1/c0;->b:Lu1/h;

    invoke-interface {v1}, Lu1/h;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu1/c0$g;->h(J)J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method private K(Lu1/c0$g;)Landroid/media/AudioTrack;
    .locals 3

    :try_start_0
    iget-boolean v0, p0, Lu1/c0;->a0:Z

    iget-object v1, p0, Lu1/c0;->w:Lu1/e;

    iget v2, p0, Lu1/c0;->X:I

    invoke-virtual {p1, v0, v1, v2}, Lu1/c0$g;->a(ZLu1/e;I)Landroid/media/AudioTrack;

    move-result-object p1

    iget-object v0, p0, Lu1/c0;->q:Ls1/s$a;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lu1/c0;->a0(Landroid/media/AudioTrack;)Z

    move-result v1

    invoke-interface {v0, v1}, Ls1/s$a;->C(Z)V
    :try_end_0
    .catch Lu1/v$b; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lu1/c0;->s:Lu1/v$c;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lu1/v$c;->c(Ljava/lang/Exception;)V

    :cond_1
    throw p1
.end method

.method private L()Landroid/media/AudioTrack;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/c0$g;

    invoke-direct {p0, v0}, Lu1/c0;->K(Lu1/c0$g;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_0
    .catch Lu1/v$b; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lu1/c0;->u:Lu1/c0$g;

    iget v2, v1, Lu1/c0$g;->h:I

    const v3, 0xf4240

    if-le v2, v3, :cond_0

    invoke-virtual {v1, v3}, Lu1/c0$g;->c(I)Lu1/c0$g;

    move-result-object v1

    :try_start_1
    invoke-direct {p0, v1}, Lu1/c0;->K(Lu1/c0$g;)Landroid/media/AudioTrack;

    move-result-object v2

    iput-object v1, p0, Lu1/c0;->u:Lu1/c0$g;
    :try_end_1
    .catch Lu1/v$b; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0}, Lu1/c0;->c0()V

    throw v0
.end method

.method private M()Z
    .locals 9

    iget v0, p0, Lu1/c0;->S:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput v3, p0, Lu1/c0;->S:I

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget v4, p0, Lu1/c0;->S:I

    iget-object v5, p0, Lu1/c0;->L:[Lu1/g;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_3

    aget-object v4, v5, v4

    if-eqz v0, :cond_1

    invoke-interface {v4}, Lu1/g;->d()V

    :cond_1
    invoke-direct {p0, v7, v8}, Lu1/c0;->e0(J)V

    invoke-interface {v4}, Lu1/g;->b()Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    :cond_2
    iget v0, p0, Lu1/c0;->S:I

    add-int/2addr v0, v2

    iput v0, p0, Lu1/c0;->S:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lu1/c0;->P:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    invoke-direct {p0, v0, v7, v8}, Lu1/c0;->r0(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lu1/c0;->P:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    return v3

    :cond_4
    iput v1, p0, Lu1/c0;->S:I

    return v2
.end method

.method private N()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lu1/c0;->L:[Lu1/g;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-interface {v1}, Lu1/g;->flush()V

    iget-object v2, p0, Lu1/c0;->M:[Ljava/nio/ByteBuffer;

    invoke-interface {v1}, Lu1/g;->c()Ljava/nio/ByteBuffer;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static O(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method private P()Ls1/b3;
    .locals 1

    invoke-direct {p0}, Lu1/c0;->S()Lu1/c0$j;

    move-result-object v0

    iget-object v0, v0, Lu1/c0$j;->a:Ls1/b3;

    return-object v0
.end method

.method private static Q(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result p0

    const/4 p1, -0x2

    if-eq p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->f(Z)V

    return p0
.end method

.method private static R(ILjava/nio/ByteBuffer;)I
    .locals 2

    const/16 v0, 0x400

    const/4 v1, -0x1

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected audio encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-static {p1}, Lu1/i0;->g(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_2
    invoke-static {p1}, Lu1/c;->c(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_3
    return v0

    :pswitch_4
    const/16 p0, 0x200

    return p0

    :pswitch_5
    invoke-static {p1}, Lu1/b;->b(Ljava/nio/ByteBuffer;)I

    move-result p0

    if-ne p0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1, p0}, Lu1/b;->i(Ljava/nio/ByteBuffer;I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x10

    :goto_0
    return p0

    :pswitch_6
    const/16 p0, 0x800

    return p0

    :pswitch_7
    return v0

    :pswitch_8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p0

    invoke-static {p1, p0}, Lp3/n0;->I(Ljava/nio/ByteBuffer;I)I

    move-result p0

    invoke-static {p0}, Lu1/h0;->m(I)I

    move-result p0

    if-eq p0, v1, :cond_1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_9
    invoke-static {p1}, Lu1/e0;->e(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_a
    invoke-static {p1}, Lu1/b;->e(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_a
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private S()Lu1/c0$j;
    .locals 1

    iget-object v0, p0, Lu1/c0;->x:Lu1/c0$j;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/c0$j;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu1/c0;->y:Lu1/c0$j;

    :goto_0
    return-object v0
.end method

.method private T(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Landroid/media/AudioManager;->getPlaybackOffloadSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, p2}, Landroid/media/AudioManager;->isOffloadedPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/16 p1, 0x1e

    if-ne v0, p1, :cond_2

    sget-object p1, Lp3/n0;->d:Ljava/lang/String;

    const-string p2, "Pixel"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private V()J
    .locals 5

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget v1, v0, Lu1/c0$g;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lu1/c0;->C:J

    iget v0, v0, Lu1/c0$g;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lu1/c0;->D:J

    :goto_0
    return-wide v1
.end method

.method private W()J
    .locals 5

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget v1, v0, Lu1/c0$g;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lu1/c0;->E:J

    iget v0, v0, Lu1/c0$g;->d:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lu1/c0;->F:J

    :goto_0
    return-wide v1
.end method

.method private X()Z
    .locals 10

    iget-object v0, p0, Lu1/c0;->h:Lp3/g;

    invoke-virtual {v0}, Lp3/g;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Lu1/c0;->L()Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Lu1/c0;->a0(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-direct {p0, v0}, Lu1/c0;->f0(Landroid/media/AudioTrack;)V

    iget v0, p0, Lu1/c0;->l:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu1/c0;->u:Lu1/c0$g;

    iget-object v2, v2, Lu1/c0$g;->a:Ls1/n1;

    iget v3, v2, Ls1/n1;->K:I

    iget v2, v2, Ls1/n1;->L:I

    invoke-virtual {v0, v3, v2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_1
    sget v0, Lp3/n0;->a:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_2

    iget-object v2, p0, Lu1/c0;->r:Lt1/t1;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {v3, v2}, Lu1/c0$c;->a(Landroid/media/AudioTrack;Lt1/t1;)V

    :cond_2
    iget-object v2, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v2

    iput v2, p0, Lu1/c0;->X:I

    iget-object v3, p0, Lu1/c0;->i:Lu1/x;

    iget-object v4, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu1/c0;->u:Lu1/c0$g;

    iget v5, v2, Lu1/c0$g;->c:I

    const/4 v6, 0x2

    const/4 v9, 0x1

    if-ne v5, v6, :cond_3

    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    iget v6, v2, Lu1/c0$g;->g:I

    iget v7, v2, Lu1/c0$g;->d:I

    iget v8, v2, Lu1/c0$g;->h:I

    invoke-virtual/range {v3 .. v8}, Lu1/x;->s(Landroid/media/AudioTrack;ZIII)V

    invoke-direct {p0}, Lu1/c0;->k0()V

    iget-object v1, p0, Lu1/c0;->Y:Lu1/y;

    iget v1, v1, Lu1/y;->a:I

    if-eqz v1, :cond_4

    iget-object v2, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v2, v1}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    iget-object v1, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu1/c0;->Y:Lu1/y;

    iget v2, v2, Lu1/y;->b:F

    invoke-virtual {v1, v2}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_4
    iget-object v1, p0, Lu1/c0;->Z:Lu1/c0$d;

    if-eqz v1, :cond_5

    const/16 v2, 0x17

    if-lt v0, v2, :cond_5

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {v0, v1}, Lu1/c0$b;->a(Landroid/media/AudioTrack;Lu1/c0$d;)V

    :cond_5
    iput-boolean v9, p0, Lu1/c0;->I:Z

    return v9
.end method

.method private static Y(I)Z
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, -0x6

    if-eq p0, v0, :cond_1

    :cond_0
    const/16 v0, -0x20

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private Z()Z
    .locals 1

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static a0(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic b0(Landroid/media/AudioTrack;Lp3/g;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {p1}, Lp3/g;->e()Z

    sget-object p0, Lu1/c0;->f0:Ljava/lang/Object;

    monitor-enter p0

    :try_start_1
    sget p1, Lu1/c0;->h0:I

    add-int/lit8 p1, p1, -0x1

    sput p1, Lu1/c0;->h0:I

    if-nez p1, :cond_0

    sget-object p1, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p0

    invoke-virtual {p1}, Lp3/g;->e()Z

    sget-object p1, Lu1/c0;->f0:Ljava/lang/Object;

    monitor-enter p1

    :try_start_2
    sget v1, Lu1/c0;->h0:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Lu1/c0;->h0:I

    if-nez v1, :cond_1

    sget-object v1, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    :cond_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw p0

    :catchall_2
    move-exception p0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0
.end method

.method private c0()V
    .locals 1

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    invoke-virtual {v0}, Lu1/c0$g;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/c0;->c0:Z

    return-void
.end method

.method private d0()V
    .locals 3

    iget-boolean v0, p0, Lu1/c0;->U:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/c0;->U:Z

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-direct {p0}, Lu1/c0;->W()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu1/x;->g(J)V

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const/4 v0, 0x0

    iput v0, p0, Lu1/c0;->B:I

    :cond_0
    return-void
.end method

.method private e0(J)V
    .locals 5

    iget-object v0, p0, Lu1/c0;->L:[Lu1/g;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_6

    if-lez v1, :cond_0

    iget-object v2, p0, Lu1/c0;->M:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lu1/g;->a:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    invoke-direct {p0, v2, p1, p2}, Lu1/c0;->r0(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lu1/c0;->L:[Lu1/g;

    aget-object v3, v3, v1

    iget v4, p0, Lu1/c0;->S:I

    if-le v1, v4, :cond_3

    invoke-interface {v3, v2}, Lu1/g;->e(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-interface {v3}, Lu1/g;->c()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lu1/c0;->M:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method private f0(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lu1/c0;->m:Lu1/c0$m;

    if-nez v0, :cond_0

    new-instance v0, Lu1/c0$m;

    invoke-direct {v0, p0}, Lu1/c0$m;-><init>(Lu1/c0;)V

    iput-object v0, p0, Lu1/c0;->m:Lu1/c0$m;

    :cond_0
    iget-object v0, p0, Lu1/c0;->m:Lu1/c0$m;

    invoke-virtual {v0, p1}, Lu1/c0$m;->a(Landroid/media/AudioTrack;)V

    return-void
.end method

.method private static g0(Landroid/media/AudioTrack;Lp3/g;)V
    .locals 3

    invoke-virtual {p1}, Lp3/g;->c()Z

    sget-object v0, Lu1/c0;->f0:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    const-string v1, "ExoPlayer:AudioTrackReleaseThread"

    invoke-static {v1}, Lp3/n0;->C0(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    sput-object v1, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    :cond_0
    sget v1, Lu1/c0;->h0:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lu1/c0;->h0:I

    sget-object v1, Lu1/c0;->g0:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu1/b0;

    invoke-direct {v2, p0, p1}, Lu1/b0;-><init>(Landroid/media/AudioTrack;Lp3/g;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private h0()V
    .locals 12

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu1/c0;->C:J

    iput-wide v0, p0, Lu1/c0;->D:J

    iput-wide v0, p0, Lu1/c0;->E:J

    iput-wide v0, p0, Lu1/c0;->F:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lu1/c0;->d0:Z

    iput v2, p0, Lu1/c0;->G:I

    new-instance v11, Lu1/c0$j;

    invoke-direct {p0}, Lu1/c0;->P()Ls1/b3;

    move-result-object v4

    invoke-virtual {p0}, Lu1/c0;->U()Z

    move-result v5

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lu1/c0$j;-><init>(Ls1/b3;ZJJLu1/c0$a;)V

    iput-object v11, p0, Lu1/c0;->y:Lu1/c0$j;

    iput-wide v0, p0, Lu1/c0;->J:J

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/c0;->x:Lu1/c0$j;

    iget-object v1, p0, Lu1/c0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    iput-object v0, p0, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    iput v2, p0, Lu1/c0;->O:I

    iput-object v0, p0, Lu1/c0;->P:Ljava/nio/ByteBuffer;

    iput-boolean v2, p0, Lu1/c0;->U:Z

    iput-boolean v2, p0, Lu1/c0;->T:Z

    const/4 v1, -0x1

    iput v1, p0, Lu1/c0;->S:I

    iput-object v0, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    iput v2, p0, Lu1/c0;->B:I

    iget-object v0, p0, Lu1/c0;->e:Lu1/n0;

    invoke-virtual {v0}, Lu1/n0;->n()V

    invoke-direct {p0}, Lu1/c0;->N()V

    return-void
.end method

.method private i0(Ls1/b3;Z)V
    .locals 9

    invoke-direct {p0}, Lu1/c0;->S()Lu1/c0$j;

    move-result-object v0

    iget-object v1, v0, Lu1/c0$j;->a:Ls1/b3;

    invoke-virtual {p1, v1}, Ls1/b3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lu1/c0$j;->b:Z

    if-eq p2, v0, :cond_2

    :cond_0
    new-instance v0, Lu1/c0$j;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, Lu1/c0$j;-><init>(Ls1/b3;ZJJLu1/c0$a;)V

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Lu1/c0;->x:Lu1/c0$j;

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lu1/c0;->y:Lu1/c0$j;

    :cond_2
    :goto_0
    return-void
.end method

.method private j0(Ls1/b3;)V
    .locals 2

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/media/PlaybackParams;

    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    move-result-object v0

    iget v1, p1, Ls1/b3;->j:F

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object v0

    iget p1, p1, Ls1/b3;->k:F

    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "DefaultAudioSink"

    const-string v1, "Failed to set playback params"

    invoke-static {v0, v1, p1}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance p1, Ls1/b3;

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v0

    iget-object v1, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    move-result v1

    invoke-direct {p1, v0, v1}, Ls1/b3;-><init>(FF)V

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    iget v1, p1, Ls1/b3;->j:F

    invoke-virtual {v0, v1}, Lu1/x;->t(F)V

    :cond_0
    iput-object p1, p0, Lu1/c0;->z:Ls1/b3;

    return-void
.end method

.method private k0()V
    .locals 2

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget v1, p0, Lu1/c0;->K:F

    invoke-static {v0, v1}, Lu1/c0;->l0(Landroid/media/AudioTrack;F)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget v1, p0, Lu1/c0;->K:F

    invoke-static {v0, v1}, Lu1/c0;->m0(Landroid/media/AudioTrack;F)V

    :goto_0
    return-void
.end method

.method private static l0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method private static m0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1, p1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method private n0()V
    .locals 6

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget-object v0, v0, Lu1/c0$g;->i:[Lu1/g;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu1/g;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Lu1/g;->flush()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [Lu1/g;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lu1/g;

    iput-object v1, p0, Lu1/c0;->L:[Lu1/g;

    new-array v0, v0, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/c0;->M:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lu1/c0;->N()V

    return-void
.end method

.method private o0()Z
    .locals 2

    iget-boolean v0, p0, Lu1/c0;->a0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget-object v0, v0, Lu1/c0$g;->a:Ls1/n1;

    iget-object v0, v0, Ls1/n1;->u:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget-object v0, v0, Lu1/c0$g;->a:Ls1/n1;

    iget v0, v0, Ls1/n1;->J:I

    invoke-direct {p0, v0}, Lu1/c0;->p0(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private p0(I)Z
    .locals 1

    iget-boolean v0, p0, Lu1/c0;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lp3/n0;->s0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private q0(Ls1/n1;Lu1/e;)Z
    .locals 4

    sget v0, Lp3/n0;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_9

    iget v0, p0, Lu1/c0;->l:I

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p1, Ls1/n1;->r:Ljava/lang/String;

    invoke-static {v0, v2}, Lp3/v;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget v2, p1, Ls1/n1;->H:I

    invoke-static {v2}, Lp3/n0;->G(I)I

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v3, p1, Ls1/n1;->I:I

    invoke-static {v3, v2, v0}, Lu1/c0;->O(III)Landroid/media/AudioFormat;

    move-result-object v0

    invoke-virtual {p2}, Lu1/e;->b()Lu1/e$d;

    move-result-object p2

    iget-object p2, p2, Lu1/e$d;->a:Landroid/media/AudioAttributes;

    invoke-direct {p0, v0, p2}, Lu1/c0;->T(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p2

    if-eqz p2, :cond_9

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p1, 0x2

    if-ne p2, p1, :cond_3

    return v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_4
    iget p2, p1, Ls1/n1;->K:I

    if-nez p2, :cond_6

    iget p1, p1, Ls1/n1;->L:I

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iget p2, p0, Lu1/c0;->l:I

    if-ne p2, v0, :cond_7

    const/4 p2, 0x1

    goto :goto_2

    :cond_7
    const/4 p2, 0x0

    :goto_2
    if-eqz p1, :cond_8

    if-nez p2, :cond_9

    :cond_8
    const/4 v1, 0x1

    :cond_9
    :goto_3
    return v1
.end method

.method private r0(Ljava/nio/ByteBuffer;J)V
    .locals 12

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu1/c0;->P:Ljava/nio/ByteBuffer;

    const/16 v1, 0x15

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lu1/c0;->P:Ljava/nio/ByteBuffer;

    sget v0, Lp3/n0;->a:I

    if-ge v0, v1, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget-object v4, p0, Lu1/c0;->Q:[B

    if-eqz v4, :cond_3

    array-length v4, v4

    if-ge v4, v0, :cond_4

    :cond_3
    new-array v4, v0, [B

    iput-object v4, p0, Lu1/c0;->Q:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    iget-object v5, p0, Lu1/c0;->Q:[B

    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v3, p0, Lu1/c0;->R:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    sget v4, Lp3/n0;->a:I

    if-ge v4, v1, :cond_7

    iget-object p2, p0, Lu1/c0;->i:Lu1/x;

    iget-wide v4, p0, Lu1/c0;->E:J

    invoke-virtual {p2, v4, v5}, Lu1/x;->c(J)I

    move-result p2

    if-lez p2, :cond_6

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p3, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v1, p0, Lu1/c0;->Q:[B

    iget v4, p0, Lu1/c0;->R:I

    invoke-virtual {p3, v1, v4, p2}, Landroid/media/AudioTrack;->write([BII)I

    move-result p2

    if-lez p2, :cond_a

    iget p3, p0, Lu1/c0;->R:I

    add-int/2addr p3, p2

    iput p3, p0, Lu1/c0;->R:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    goto :goto_3

    :cond_7
    iget-boolean v1, p0, Lu1/c0;->a0:Z

    if-eqz v1, :cond_9

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, p2, v4

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Lp3/a;->f(Z)V

    iget-object v7, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    move-object v6, p0

    move-object v8, p1

    move v9, v0

    move-wide v10, p2

    invoke-direct/range {v6 .. v11}, Lu1/c0;->t0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    move-result p2

    goto :goto_3

    :cond_9
    iget-object p2, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {p2, p1, v0}, Lu1/c0;->s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p2

    :cond_a
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, p0, Lu1/c0;->b0:J

    const-wide/16 v4, 0x0

    if-gez p2, :cond_e

    invoke-static {p2}, Lu1/c0;->Y(I)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-wide v0, p0, Lu1/c0;->F:J

    cmp-long p1, v0, v4

    if-lez p1, :cond_b

    goto :goto_4

    :cond_b
    const/4 v2, 0x0

    :goto_4
    new-instance p1, Lu1/v$e;

    iget-object p3, p0, Lu1/c0;->u:Lu1/c0$g;

    iget-object p3, p3, Lu1/c0$g;->a:Ls1/n1;

    invoke-direct {p1, p2, p3, v2}, Lu1/v$e;-><init>(ILs1/n1;Z)V

    iget-object p2, p0, Lu1/c0;->s:Lu1/v$c;

    if-eqz p2, :cond_c

    invoke-interface {p2, p1}, Lu1/v$c;->c(Ljava/lang/Exception;)V

    :cond_c
    iget-boolean p2, p1, Lu1/v$e;->k:Z

    if-nez p2, :cond_d

    iget-object p2, p0, Lu1/c0;->o:Lu1/c0$k;

    invoke-virtual {p2, p1}, Lu1/c0$k;->b(Ljava/lang/Exception;)V

    return-void

    :cond_d
    throw p1

    :cond_e
    iget-object p3, p0, Lu1/c0;->o:Lu1/c0$k;

    invoke-virtual {p3}, Lu1/c0$k;->a()V

    iget-object p3, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {p3}, Lu1/c0;->a0(Landroid/media/AudioTrack;)Z

    move-result p3

    if-eqz p3, :cond_10

    iget-wide v6, p0, Lu1/c0;->F:J

    cmp-long p3, v6, v4

    if-lez p3, :cond_f

    iput-boolean v3, p0, Lu1/c0;->d0:Z

    :cond_f
    iget-boolean p3, p0, Lu1/c0;->V:Z

    if-eqz p3, :cond_10

    iget-object p3, p0, Lu1/c0;->s:Lu1/v$c;

    if-eqz p3, :cond_10

    if-ge p2, v0, :cond_10

    iget-boolean v1, p0, Lu1/c0;->d0:Z

    if-nez v1, :cond_10

    invoke-interface {p3}, Lu1/v$c;->e()V

    :cond_10
    iget-object p3, p0, Lu1/c0;->u:Lu1/c0$g;

    iget p3, p3, Lu1/c0$g;->c:I

    if-nez p3, :cond_11

    iget-wide v4, p0, Lu1/c0;->E:J

    int-to-long v6, p2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lu1/c0;->E:J

    :cond_11
    if-ne p2, v0, :cond_14

    if-eqz p3, :cond_13

    iget-object p2, p0, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    if-ne p1, p2, :cond_12

    goto :goto_5

    :cond_12
    const/4 v2, 0x0

    :goto_5
    invoke-static {v2}, Lp3/a;->f(Z)V

    iget-wide p1, p0, Lu1/c0;->F:J

    iget p3, p0, Lu1/c0;->G:I

    int-to-long v0, p3

    iget p3, p0, Lu1/c0;->O:I

    int-to-long v2, p3

    mul-long v0, v0, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Lu1/c0;->F:J

    :cond_13
    const/4 p1, 0x0

    iput-object p1, p0, Lu1/c0;->P:Ljava/nio/ByteBuffer;

    :cond_14
    return-void
.end method

.method private static s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p0

    return p0
.end method

.method private t0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 10

    sget v0, Lp3/n0;->a:I

    const-wide/16 v1, 0x3e8

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_0

    const/4 v7, 0x1

    mul-long v8, p4, v1

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    const v3, 0x55550001

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_1
    iget v0, p0, Lu1/c0;->B:I

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    const/4 v4, 0x4

    invoke-virtual {v0, v4, p3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    const/16 v4, 0x8

    mul-long p4, p4, v1

    invoke-virtual {v0, v4, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    iget-object p4, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    invoke-virtual {p4, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput p3, p0, Lu1/c0;->B:I

    :cond_2
    iget-object p4, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p4

    if-lez p4, :cond_4

    iget-object p5, p0, Lu1/c0;->A:Ljava/nio/ByteBuffer;

    const/4 v0, 0x1

    invoke-virtual {p1, p5, p4, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p5

    if-gez p5, :cond_3

    iput v3, p0, Lu1/c0;->B:I

    return p5

    :cond_3
    if-ge p5, p4, :cond_4

    return v3

    :cond_4
    invoke-static {p1, p2, p3}, Lu1/c0;->s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p1

    if-gez p1, :cond_5

    iput v3, p0, Lu1/c0;->B:I

    return p1

    :cond_5
    iget p2, p0, Lu1/c0;->B:I

    sub-int/2addr p2, p1

    iput p2, p0, Lu1/c0;->B:I

    return p1
.end method

.method public static synthetic z(Landroid/media/AudioTrack;Lp3/g;)V
    .locals 0

    invoke-static {p0, p1}, Lu1/c0;->b0(Landroid/media/AudioTrack;Lp3/g;)V

    return-void
.end method


# virtual methods
.method public U()Z
    .locals 1

    invoke-direct {p0}, Lu1/c0;->S()Lu1/c0$j;

    move-result-object v0

    iget-boolean v0, v0, Lu1/c0$j;->b:Z

    return v0
.end method

.method public a(Ls1/n1;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lu1/c0;->y(Ls1/n1;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Z
    .locals 1

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu1/c0;->T:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu1/c0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public c(Ls1/b3;)V
    .locals 4

    new-instance v0, Ls1/b3;

    iget v1, p1, Ls1/b3;->j:F

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v1, v2, v3}, Lp3/n0;->p(FFF)F

    move-result v1

    iget p1, p1, Ls1/b3;->k:F

    invoke-static {p1, v2, v3}, Lp3/n0;->p(FFF)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ls1/b3;-><init>(FF)V

    iget-boolean p1, p0, Lu1/c0;->k:Z

    if-eqz p1, :cond_0

    sget p1, Lp3/n0;->a:I

    const/16 v1, 0x17

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v0}, Lu1/c0;->j0(Ls1/b3;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu1/c0;->U()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lu1/c0;->i0(Ls1/b3;Z)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/c0;->V:Z

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0}, Lu1/x;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public e(F)V
    .locals 1

    iget v0, p0, Lu1/c0;->K:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lu1/c0;->K:F

    invoke-direct {p0}, Lu1/c0;->k0()V

    :cond_0
    return-void
.end method

.method public f(Lu1/v$c;)V
    .locals 0

    iput-object p1, p0, Lu1/c0;->s:Lu1/v$c;

    return-void
.end method

.method public flush()V
    .locals 3

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lu1/c0;->h0()V

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0}, Lu1/x;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Lu1/c0;->a0(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/c0;->m:Lu1/c0$m;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/c0$m;

    iget-object v1, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Lu1/c0$m;->b(Landroid/media/AudioTrack;)V

    :cond_1
    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_2

    iget-boolean v0, p0, Lu1/c0;->W:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput v0, p0, Lu1/c0;->X:I

    :cond_2
    iget-object v0, p0, Lu1/c0;->t:Lu1/c0$g;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iput-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iput-object v1, p0, Lu1/c0;->t:Lu1/c0$g;

    :cond_3
    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0}, Lu1/x;->q()V

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu1/c0;->h:Lp3/g;

    invoke-static {v0, v2}, Lu1/c0;->g0(Landroid/media/AudioTrack;Lp3/g;)V

    iput-object v1, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    :cond_4
    iget-object v0, p0, Lu1/c0;->o:Lu1/c0$k;

    invoke-virtual {v0}, Lu1/c0$k;->a()V

    iget-object v0, p0, Lu1/c0;->n:Lu1/c0$k;

    invoke-virtual {v0}, Lu1/c0$k;->a()V

    return-void
.end method

.method public g()Ls1/b3;
    .locals 1

    iget-boolean v0, p0, Lu1/c0;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->z:Ls1/b3;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lu1/c0;->P()Ls1/b3;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public h()V
    .locals 3

    sget v0, Lp3/n0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-boolean v0, p0, Lu1/c0;->W:Z

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-boolean v0, p0, Lu1/c0;->a0:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lu1/c0;->a0:Z

    invoke-virtual {p0}, Lu1/c0;->flush()V

    :cond_1
    return-void
.end method

.method public i(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lu1/c0$d;

    invoke-direct {v0, p1}, Lu1/c0$d;-><init>(Landroid/media/AudioDeviceInfo;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lu1/c0;->Z:Lu1/c0$d;

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lu1/c0$b;->a(Landroid/media/AudioTrack;Lu1/c0$d;)V

    :cond_1
    return-void
.end method

.method public j()V
    .locals 1

    iget-boolean v0, p0, Lu1/c0;->T:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lu1/c0;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lu1/c0;->d0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/c0;->T:Z

    :cond_0
    return-void
.end method

.method public k()Z
    .locals 3

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-direct {p0}, Lu1/c0;->W()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu1/x;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(I)V
    .locals 1

    iget v0, p0, Lu1/c0;->X:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lu1/c0;->X:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lu1/c0;->W:Z

    invoke-virtual {p0}, Lu1/c0;->flush()V

    :cond_1
    return-void
.end method

.method public m(Ls1/n1;I[I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v0, v3, Ls1/n1;->u:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_5

    iget v0, v3, Ls1/n1;->J:I

    invoke-static {v0}, Lp3/n0;->t0(I)Z

    move-result v0

    invoke-static {v0}, Lp3/a;->a(Z)V

    iget v0, v3, Ls1/n1;->J:I

    iget v6, v3, Ls1/n1;->H:I

    invoke-static {v0, v6}, Lp3/n0;->d0(II)I

    move-result v0

    iget v6, v3, Ls1/n1;->J:I

    invoke-direct {v1, v6}, Lu1/c0;->p0(I)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, v1, Lu1/c0;->g:[Lu1/g;

    goto :goto_0

    :cond_0
    iget-object v6, v1, Lu1/c0;->f:[Lu1/g;

    :goto_0
    iget-object v7, v1, Lu1/c0;->e:Lu1/n0;

    iget v8, v3, Ls1/n1;->K:I

    iget v9, v3, Ls1/n1;->L:I

    invoke-virtual {v7, v8, v9}, Lu1/n0;->o(II)V

    sget v7, Lp3/n0;->a:I

    const/16 v8, 0x15

    if-ge v7, v8, :cond_1

    iget v7, v3, Ls1/n1;->H:I

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    if-nez p3, :cond_1

    const/4 v7, 0x6

    new-array v8, v7, [I

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v7, :cond_2

    aput v9, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p3

    :cond_2
    iget-object v7, v1, Lu1/c0;->d:Lu1/a0;

    invoke-virtual {v7, v8}, Lu1/a0;->m([I)V

    new-instance v7, Lu1/g$a;

    iget v8, v3, Ls1/n1;->I:I

    iget v9, v3, Ls1/n1;->H:I

    iget v10, v3, Ls1/n1;->J:I

    invoke-direct {v7, v8, v9, v10}, Lu1/g$a;-><init>(III)V

    array-length v8, v6

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_4

    aget-object v10, v6, v9

    :try_start_0
    invoke-interface {v10, v7}, Lu1/g;->f(Lu1/g$a;)Lu1/g$a;

    move-result-object v11

    invoke-interface {v10}, Lu1/g;->a()Z

    move-result v10
    :try_end_0
    .catch Lu1/g$b; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v10, :cond_3

    move-object v7, v11

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v2, Lu1/v$a;

    invoke-direct {v2, v0, v3}, Lu1/v$a;-><init>(Ljava/lang/Throwable;Ls1/n1;)V

    throw v2

    :cond_4
    iget v8, v7, Lu1/g$a;->c:I

    iget v9, v7, Lu1/g$a;->a:I

    iget v10, v7, Lu1/g$a;->b:I

    invoke-static {v10}, Lp3/n0;->G(I)I

    move-result v10

    iget v7, v7, Lu1/g$a;->b:I

    invoke-static {v8, v7}, Lp3/n0;->d0(II)I

    move-result v7

    move-object/from16 v16, v6

    move v13, v7

    move v11, v8

    move v14, v9

    move v12, v10

    const/4 v15, 0x0

    goto :goto_3

    :cond_5
    new-array v0, v5, [Lu1/g;

    iget v6, v3, Ls1/n1;->I:I

    iget-object v7, v1, Lu1/c0;->w:Lu1/e;

    invoke-direct {v1, v3, v7}, Lu1/c0;->q0(Ls1/n1;Lu1/e;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, v3, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v7}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v8, v3, Ls1/n1;->r:Ljava/lang/String;

    invoke-static {v7, v8}, Lp3/v;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    iget v8, v3, Ls1/n1;->H:I

    invoke-static {v8}, Lp3/n0;->G(I)I

    move-result v8

    move-object/from16 v16, v0

    move v14, v6

    move v11, v7

    move v12, v8

    const/4 v0, -0x1

    const/4 v13, -0x1

    const/4 v15, 0x1

    goto :goto_3

    :cond_6
    const/4 v7, 0x2

    iget-object v8, v1, Lu1/c0;->a:Lu1/f;

    invoke-virtual {v8, v3}, Lu1/f;->f(Ls1/n1;)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_d

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object/from16 v16, v0

    move v14, v6

    move v12, v8

    move v11, v9

    const/4 v0, -0x1

    const/4 v13, -0x1

    const/4 v15, 0x2

    :goto_3
    const-string v6, ") for: "

    if-eqz v11, :cond_c

    if-eqz v12, :cond_b

    if-eqz p2, :cond_7

    move/from16 v10, p2

    move/from16 v19, v11

    move/from16 v20, v12

    move/from16 v22, v13

    move/from16 v21, v14

    goto :goto_6

    :cond_7
    iget-object v6, v1, Lu1/c0;->p:Lu1/c0$e;

    invoke-static {v14, v12, v11}, Lu1/c0;->Q(III)I

    move-result v7

    if-eq v13, v2, :cond_8

    move v10, v13

    goto :goto_4

    :cond_8
    const/4 v10, 0x1

    :goto_4
    iget v2, v3, Ls1/n1;->q:I

    iget-boolean v4, v1, Lu1/c0;->k:Z

    if-eqz v4, :cond_9

    const-wide/high16 v8, 0x4020000000000000L    # 8.0

    goto :goto_5

    :cond_9
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    :goto_5
    move-wide/from16 v17, v8

    move v8, v11

    move v9, v15

    move/from16 v19, v11

    move v11, v14

    move/from16 v20, v12

    move v12, v2

    move/from16 v22, v13

    move/from16 v21, v14

    move-wide/from16 v13, v17

    invoke-interface/range {v6 .. v14}, Lu1/c0$e;->a(IIIIIID)I

    move-result v2

    move v10, v2

    :goto_6
    iput-boolean v5, v1, Lu1/c0;->c0:Z

    new-instance v12, Lu1/c0$g;

    move-object v2, v12

    move-object/from16 v3, p1

    move v4, v0

    move v5, v15

    move/from16 v6, v22

    move/from16 v7, v21

    move/from16 v8, v20

    move/from16 v9, v19

    move-object/from16 v11, v16

    invoke-direct/range {v2 .. v11}, Lu1/c0$g;-><init>(Ls1/n1;IIIIIII[Lu1/g;)V

    invoke-direct/range {p0 .. p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_a

    iput-object v12, v1, Lu1/c0;->t:Lu1/c0$g;

    goto :goto_7

    :cond_a
    iput-object v12, v1, Lu1/c0;->u:Lu1/c0$g;

    :goto_7
    return-void

    :cond_b
    new-instance v0, Lu1/v$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid output channel config (mode="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu1/v$a;-><init>(Ljava/lang/String;Ls1/n1;)V

    throw v0

    :cond_c
    new-instance v0, Lu1/v$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid output encoding (mode="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu1/v$a;-><init>(Ljava/lang/String;Ls1/n1;)V

    throw v0

    :cond_d
    new-instance v0, Lu1/v$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to configure passthrough for: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu1/v$a;-><init>(Ljava/lang/String;Ls1/n1;)V

    throw v0
.end method

.method public n(Lt1/t1;)V
    .locals 0

    iput-object p1, p0, Lu1/c0;->r:Lt1/t1;

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/c0;->V:Z

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0}, Lu1/x;->u()V

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public p(Ljava/nio/ByteBuffer;JI)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move/from16 v4, p4

    iget-object v5, v1, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-static {v5}, Lp3/a;->a(Z)V

    iget-object v5, v1, Lu1/c0;->t:Lu1/c0$g;

    const/4 v8, 0x0

    if-eqz v5, :cond_7

    invoke-direct/range {p0 .. p0}, Lu1/c0;->M()Z

    move-result v5

    if-nez v5, :cond_2

    return v7

    :cond_2
    iget-object v5, v1, Lu1/c0;->t:Lu1/c0$g;

    iget-object v9, v1, Lu1/c0;->u:Lu1/c0$g;

    invoke-virtual {v5, v9}, Lu1/c0$g;->b(Lu1/c0$g;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-direct/range {p0 .. p0}, Lu1/c0;->d0()V

    invoke-virtual/range {p0 .. p0}, Lu1/c0;->k()Z

    move-result v5

    if-eqz v5, :cond_3

    return v7

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lu1/c0;->flush()V

    goto :goto_2

    :cond_4
    iget-object v5, v1, Lu1/c0;->t:Lu1/c0$g;

    iput-object v5, v1, Lu1/c0;->u:Lu1/c0$g;

    iput-object v8, v1, Lu1/c0;->t:Lu1/c0$g;

    iget-object v5, v1, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-static {v5}, Lu1/c0;->a0(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, v1, Lu1/c0;->l:I

    const/4 v9, 0x3

    if-eq v5, v9, :cond_6

    iget-object v5, v1, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    if-ne v5, v9, :cond_5

    iget-object v5, v1, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    :cond_5
    iget-object v5, v1, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v9, v1, Lu1/c0;->u:Lu1/c0$g;

    iget-object v9, v9, Lu1/c0$g;->a:Ls1/n1;

    iget v10, v9, Ls1/n1;->K:I

    iget v9, v9, Ls1/n1;->L:I

    invoke-virtual {v5, v10, v9}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v6, v1, Lu1/c0;->d0:Z

    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3}, Lu1/c0;->H(J)V

    :cond_7
    invoke-direct/range {p0 .. p0}, Lu1/c0;->Z()Z

    move-result v5

    if-nez v5, :cond_9

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lu1/c0;->X()Z

    move-result v5
    :try_end_0
    .catch Lu1/v$b; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v5, :cond_9

    return v7

    :catch_0
    move-exception v0

    move-object v2, v0

    iget-boolean v0, v2, Lu1/v$b;->k:Z

    if-nez v0, :cond_8

    iget-object v0, v1, Lu1/c0;->n:Lu1/c0$k;

    invoke-virtual {v0, v2}, Lu1/c0$k;->b(Ljava/lang/Exception;)V

    return v7

    :cond_8
    throw v2

    :cond_9
    iget-object v5, v1, Lu1/c0;->n:Lu1/c0$k;

    invoke-virtual {v5}, Lu1/c0$k;->a()V

    iget-boolean v5, v1, Lu1/c0;->I:Z

    const-wide/16 v9, 0x0

    if-eqz v5, :cond_b

    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    iput-wide v11, v1, Lu1/c0;->J:J

    iput-boolean v7, v1, Lu1/c0;->H:Z

    iput-boolean v7, v1, Lu1/c0;->I:Z

    iget-boolean v5, v1, Lu1/c0;->k:Z

    if-eqz v5, :cond_a

    sget v5, Lp3/n0;->a:I

    const/16 v11, 0x17

    if-lt v5, v11, :cond_a

    iget-object v5, v1, Lu1/c0;->z:Ls1/b3;

    invoke-direct {v1, v5}, Lu1/c0;->j0(Ls1/b3;)V

    :cond_a
    invoke-direct {v1, v2, v3}, Lu1/c0;->H(J)V

    iget-boolean v5, v1, Lu1/c0;->V:Z

    if-eqz v5, :cond_b

    invoke-virtual/range {p0 .. p0}, Lu1/c0;->o()V

    :cond_b
    iget-object v5, v1, Lu1/c0;->i:Lu1/x;

    invoke-direct/range {p0 .. p0}, Lu1/c0;->W()J

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Lu1/x;->k(J)Z

    move-result v5

    if-nez v5, :cond_c

    return v7

    :cond_c
    iget-object v5, v1, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    if-nez v5, :cond_17

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v5, v11, :cond_d

    const/4 v5, 0x1

    goto :goto_3

    :cond_d
    const/4 v5, 0x0

    :goto_3
    invoke-static {v5}, Lp3/a;->a(Z)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_e

    return v6

    :cond_e
    iget-object v5, v1, Lu1/c0;->u:Lu1/c0$g;

    iget v11, v5, Lu1/c0$g;->c:I

    if-eqz v11, :cond_f

    iget v11, v1, Lu1/c0;->G:I

    if-nez v11, :cond_f

    iget v5, v5, Lu1/c0$g;->g:I

    invoke-static {v5, v0}, Lu1/c0;->R(ILjava/nio/ByteBuffer;)I

    move-result v5

    iput v5, v1, Lu1/c0;->G:I

    if-nez v5, :cond_f

    return v6

    :cond_f
    iget-object v5, v1, Lu1/c0;->x:Lu1/c0$j;

    if-eqz v5, :cond_11

    invoke-direct/range {p0 .. p0}, Lu1/c0;->M()Z

    move-result v5

    if-nez v5, :cond_10

    return v7

    :cond_10
    invoke-direct {v1, v2, v3}, Lu1/c0;->H(J)V

    iput-object v8, v1, Lu1/c0;->x:Lu1/c0$j;

    :cond_11
    iget-wide v11, v1, Lu1/c0;->J:J

    iget-object v5, v1, Lu1/c0;->u:Lu1/c0$g;

    invoke-direct/range {p0 .. p0}, Lu1/c0;->V()J

    move-result-wide v13

    iget-object v15, v1, Lu1/c0;->e:Lu1/n0;

    invoke-virtual {v15}, Lu1/n0;->m()J

    move-result-wide v15

    sub-long/2addr v13, v15

    invoke-virtual {v5, v13, v14}, Lu1/c0$g;->k(J)J

    move-result-wide v13

    add-long/2addr v11, v13

    iget-boolean v5, v1, Lu1/c0;->H:Z

    if-nez v5, :cond_13

    sub-long v13, v11, v2

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v13

    const-wide/32 v15, 0x30d40

    cmp-long v5, v13, v15

    if-lez v5, :cond_13

    iget-object v5, v1, Lu1/c0;->s:Lu1/v$c;

    if-eqz v5, :cond_12

    new-instance v13, Lu1/v$d;

    invoke-direct {v13, v2, v3, v11, v12}, Lu1/v$d;-><init>(JJ)V

    invoke-interface {v5, v13}, Lu1/v$c;->c(Ljava/lang/Exception;)V

    :cond_12
    iput-boolean v6, v1, Lu1/c0;->H:Z

    :cond_13
    iget-boolean v5, v1, Lu1/c0;->H:Z

    if-eqz v5, :cond_15

    invoke-direct/range {p0 .. p0}, Lu1/c0;->M()Z

    move-result v5

    if-nez v5, :cond_14

    return v7

    :cond_14
    sub-long v11, v2, v11

    iget-wide v13, v1, Lu1/c0;->J:J

    add-long/2addr v13, v11

    iput-wide v13, v1, Lu1/c0;->J:J

    iput-boolean v7, v1, Lu1/c0;->H:Z

    invoke-direct {v1, v2, v3}, Lu1/c0;->H(J)V

    iget-object v5, v1, Lu1/c0;->s:Lu1/v$c;

    if-eqz v5, :cond_15

    cmp-long v13, v11, v9

    if-eqz v13, :cond_15

    invoke-interface {v5}, Lu1/v$c;->d()V

    :cond_15
    iget-object v5, v1, Lu1/c0;->u:Lu1/c0$g;

    iget v5, v5, Lu1/c0$g;->c:I

    if-nez v5, :cond_16

    iget-wide v9, v1, Lu1/c0;->C:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    int-to-long v11, v5

    add-long/2addr v9, v11

    iput-wide v9, v1, Lu1/c0;->C:J

    goto :goto_4

    :cond_16
    iget-wide v9, v1, Lu1/c0;->D:J

    iget v5, v1, Lu1/c0;->G:I

    int-to-long v11, v5

    int-to-long v13, v4

    mul-long v11, v11, v13

    add-long/2addr v9, v11

    iput-wide v9, v1, Lu1/c0;->D:J

    :goto_4
    iput-object v0, v1, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    iput v4, v1, Lu1/c0;->O:I

    :cond_17
    invoke-direct {v1, v2, v3}, Lu1/c0;->e0(J)V

    iget-object v0, v1, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_18

    iput-object v8, v1, Lu1/c0;->N:Ljava/nio/ByteBuffer;

    iput v7, v1, Lu1/c0;->O:I

    return v6

    :cond_18
    iget-object v0, v1, Lu1/c0;->i:Lu1/x;

    invoke-direct/range {p0 .. p0}, Lu1/c0;->W()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lu1/x;->j(J)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    invoke-static {v0, v2}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lu1/c0;->flush()V

    return v6

    :cond_19
    return v7
.end method

.method public q(Z)J
    .locals 4

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu1/c0;->I:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0, p1}, Lu1/x;->d(Z)J

    move-result-wide v0

    iget-object p1, p0, Lu1/c0;->u:Lu1/c0$g;

    invoke-direct {p0}, Lu1/c0;->W()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lu1/c0$g;->h(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lu1/c0;->I(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lu1/c0;->J(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public r(Lu1/y;)V
    .locals 4

    iget-object v0, p0, Lu1/c0;->Y:Lu1/y;

    invoke-virtual {v0, p1}, Lu1/y;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lu1/y;->a:I

    iget v1, p1, Lu1/y;->b:F

    iget-object v2, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu1/c0;->Y:Lu1/y;

    iget v3, v3, Lu1/y;->a:I

    if-eq v3, v0, :cond_1

    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_2
    iput-object p1, p0, Lu1/c0;->Y:Lu1/y;

    return-void
.end method

.method public reset()V
    .locals 5

    invoke-virtual {p0}, Lu1/c0;->flush()V

    iget-object v0, p0, Lu1/c0;->f:[Lu1/g;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu1/g;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/c0;->g:[Lu1/g;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu1/g;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p0, Lu1/c0;->V:Z

    iput-boolean v2, p0, Lu1/c0;->c0:Z

    return-void
.end method

.method public s()V
    .locals 1

    iget-boolean v0, p0, Lu1/c0;->a0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/c0;->a0:Z

    invoke-virtual {p0}, Lu1/c0;->flush()V

    :cond_0
    return-void
.end method

.method public t(Lu1/e;)V
    .locals 1

    iget-object v0, p0, Lu1/c0;->w:Lu1/e;

    invoke-virtual {v0, p1}, Lu1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lu1/c0;->w:Lu1/e;

    iget-boolean p1, p0, Lu1/c0;->a0:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lu1/c0;->flush()V

    return-void
.end method

.method public synthetic u(J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu1/u;->a(Lu1/v;J)V

    return-void
.end method

.method public v()V
    .locals 8

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x19

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lu1/c0;->flush()V

    return-void

    :cond_0
    iget-object v0, p0, Lu1/c0;->o:Lu1/c0$k;

    invoke-virtual {v0}, Lu1/c0$k;->a()V

    iget-object v0, p0, Lu1/c0;->n:Lu1/c0$k;

    invoke-virtual {v0}, Lu1/c0$k;->a()V

    invoke-direct {p0}, Lu1/c0;->Z()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lu1/c0;->h0()V

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0}, Lu1/x;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_2
    iget-object v0, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lu1/c0;->i:Lu1/x;

    invoke-virtual {v0}, Lu1/x;->q()V

    iget-object v1, p0, Lu1/c0;->i:Lu1/x;

    iget-object v2, p0, Lu1/c0;->v:Landroid/media/AudioTrack;

    iget-object v0, p0, Lu1/c0;->u:Lu1/c0$g;

    iget v3, v0, Lu1/c0$g;->c:I

    const/4 v4, 0x2

    const/4 v7, 0x1

    if-ne v3, v4, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget v4, v0, Lu1/c0$g;->g:I

    iget v5, v0, Lu1/c0$g;->d:I

    iget v6, v0, Lu1/c0$g;->h:I

    invoke-virtual/range {v1 .. v6}, Lu1/x;->s(Landroid/media/AudioTrack;ZIII)V

    iput-boolean v7, p0, Lu1/c0;->I:Z

    return-void
.end method

.method public w(Z)V
    .locals 1

    invoke-direct {p0}, Lu1/c0;->P()Ls1/b3;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lu1/c0;->i0(Ls1/b3;Z)V

    return-void
.end method

.method public x()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/c0;->H:Z

    return-void
.end method

.method public y(Ls1/n1;)I
    .locals 3

    iget-object v0, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    iget v0, p1, Ls1/n1;->J:I

    invoke-static {v0}, Lp3/n0;->t0(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid PCM encoding: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Ls1/n1;->J:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DefaultAudioSink"

    invoke-static {v0, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget p1, p1, Ls1/n1;->J:I

    if-eq p1, v2, :cond_2

    iget-boolean v0, p0, Lu1/c0;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2

    :cond_3
    iget-boolean v0, p0, Lu1/c0;->c0:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lu1/c0;->w:Lu1/e;

    invoke-direct {p0, p1, v0}, Lu1/c0;->q0(Ls1/n1;Lu1/e;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, Lu1/c0;->a:Lu1/f;

    invoke-virtual {v0, p1}, Lu1/f;->h(Ls1/n1;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v1
.end method
