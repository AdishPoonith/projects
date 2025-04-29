.class public final Ls1/y3$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final A:Ljava/lang/Object;

.field private static final B:Ljava/lang/Object;

.field private static final C:Ls1/v1;

.field private static final D:Ljava/lang/String;

.field private static final E:Ljava/lang/String;

.field private static final F:Ljava/lang/String;

.field private static final G:Ljava/lang/String;

.field private static final H:Ljava/lang/String;

.field private static final I:Ljava/lang/String;

.field private static final J:Ljava/lang/String;

.field private static final K:Ljava/lang/String;

.field private static final L:Ljava/lang/String;

.field private static final M:Ljava/lang/String;

.field private static final N:Ljava/lang/String;

.field private static final O:Ljava/lang/String;

.field private static final P:Ljava/lang/String;

.field public static final Q:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/y3$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public l:Ls1/v1;

.field public m:Ljava/lang/Object;

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public r:Z

.field public s:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public t:Ls1/v1$g;

.field public u:Z

.field public v:J

.field public w:J

.field public x:I

.field public y:I

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls1/y3$d;->A:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls1/y3$d;->B:Ljava/lang/Object;

    new-instance v0, Ls1/v1$c;

    invoke-direct {v0}, Ls1/v1$c;-><init>()V

    const-string v1, "com.google.android.exoplayer2.Timeline"

    invoke-virtual {v0, v1}, Ls1/v1$c;->c(Ljava/lang/String;)Ls1/v1$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ls1/v1$c;->e(Landroid/net/Uri;)Ls1/v1$c;

    move-result-object v0

    invoke-virtual {v0}, Ls1/v1$c;->a()Ls1/v1;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->C:Ls1/v1;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->D:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->E:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->F:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->G:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->H:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->I:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->J:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->K:Ljava/lang/String;

    const/16 v0, 0x9

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->L:Ljava/lang/String;

    const/16 v0, 0xa

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->M:Ljava/lang/String;

    const/16 v0, 0xb

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->N:Ljava/lang/String;

    const/16 v0, 0xc

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->O:Ljava/lang/String;

    const/16 v0, 0xd

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$d;->P:Ljava/lang/String;

    sget-object v0, Ls1/a4;->a:Ls1/a4;

    sput-object v0, Ls1/y3$d;->Q:Ls1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ls1/y3$d;->A:Ljava/lang/Object;

    iput-object v0, p0, Ls1/y3$d;->j:Ljava/lang/Object;

    sget-object v0, Ls1/y3$d;->C:Ls1/v1;

    iput-object v0, p0, Ls1/y3$d;->l:Ls1/v1;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/y3$d;
    .locals 0

    invoke-static {p0}, Ls1/y3$d;->b(Landroid/os/Bundle;)Ls1/y3$d;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Ls1/y3$d;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Ls1/y3$d;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Ls1/v1;->x:Ls1/h$a;

    invoke-interface {v2, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    check-cast v1, Ls1/v1;

    goto :goto_0

    :cond_0
    sget-object v1, Ls1/v1;->r:Ls1/v1;

    :goto_0
    move-object v4, v1

    sget-object v1, Ls1/y3$d;->E:Ljava/lang/String;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v1, Ls1/y3$d;->F:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v1, Ls1/y3$d;->G:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v1, Ls1/y3$d;->H:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    sget-object v1, Ls1/y3$d;->I:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    sget-object v1, Ls1/y3$d;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v14, Ls1/v1$g;->u:Ls1/h$a;

    invoke-interface {v14, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    check-cast v1, Ls1/v1$g;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    move-object v14, v1

    sget-object v1, Ls1/y3$d;->K:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sget-object v15, Ls1/y3$d;->L:Ljava/lang/String;

    move-wide/from16 v23, v6

    const-wide/16 v5, 0x0

    invoke-virtual {v0, v15, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v15

    sget-object v7, Ls1/y3$d;->M:Ljava/lang/String;

    invoke-virtual {v0, v7, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v17

    sget-object v2, Ls1/y3$d;->N:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v19

    sget-object v2, Ls1/y3$d;->O:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v20

    sget-object v2, Ls1/y3$d;->P:Ljava/lang/String;

    invoke-virtual {v0, v2, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v21

    new-instance v0, Ls1/y3$d;

    move-object v2, v0

    invoke-direct {v0}, Ls1/y3$d;-><init>()V

    sget-object v3, Ls1/y3$d;->B:Ljava/lang/Object;

    const/4 v5, 0x0

    move-wide/from16 v6, v23

    invoke-virtual/range {v2 .. v22}, Ls1/y3$d;->h(Ljava/lang/Object;Ls1/v1;Ljava/lang/Object;JJJZZLs1/v1$g;JJIIJ)Ls1/y3$d;

    iput-boolean v1, v0, Ls1/y3$d;->u:Z

    return-object v0
.end method


# virtual methods
.method public c()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$d;->p:J

    invoke-static {v0, v1}, Lp3/n0;->a0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$d;->v:J

    invoke-static {v0, v1}, Lp3/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$d;->v:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/y3$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ls1/y3$d;

    iget-object v2, p0, Ls1/y3$d;->j:Ljava/lang/Object;

    iget-object v3, p1, Ls1/y3$d;->j:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/y3$d;->l:Ls1/v1;

    iget-object v3, p1, Ls1/y3$d;->l:Ls1/v1;

    invoke-static {v2, v3}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/y3$d;->m:Ljava/lang/Object;

    iget-object v3, p1, Ls1/y3$d;->m:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/y3$d;->t:Ls1/v1$g;

    iget-object v3, p1, Ls1/y3$d;->t:Ls1/v1$g;

    invoke-static {v2, v3}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Ls1/y3$d;->n:J

    iget-wide v4, p1, Ls1/y3$d;->n:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ls1/y3$d;->o:J

    iget-wide v4, p1, Ls1/y3$d;->o:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ls1/y3$d;->p:J

    iget-wide v4, p1, Ls1/y3$d;->p:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-boolean v2, p0, Ls1/y3$d;->q:Z

    iget-boolean v3, p1, Ls1/y3$d;->q:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ls1/y3$d;->r:Z

    iget-boolean v3, p1, Ls1/y3$d;->r:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ls1/y3$d;->u:Z

    iget-boolean v3, p1, Ls1/y3$d;->u:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/y3$d;->v:J

    iget-wide v4, p1, Ls1/y3$d;->v:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ls1/y3$d;->w:J

    iget-wide v4, p1, Ls1/y3$d;->w:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ls1/y3$d;->x:I

    iget v3, p1, Ls1/y3$d;->x:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls1/y3$d;->y:I

    iget v3, p1, Ls1/y3$d;->y:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/y3$d;->z:J

    iget-wide v4, p1, Ls1/y3$d;->z:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$d;->w:J

    invoke-static {v0, v1}, Lp3/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g()Z
    .locals 4

    iget-boolean v0, p0, Ls1/y3$d;->s:Z

    iget-object v1, p0, Ls1/y3$d;->t:Ls1/v1$g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ls1/y3$d;->t:Ls1/v1$g;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    return v2
.end method

.method public h(Ljava/lang/Object;Ls1/v1;Ljava/lang/Object;JJJZZLs1/v1$g;JJIIJ)Ls1/y3$d;
    .locals 5

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p12

    move-object v3, p1

    iput-object v3, v0, Ls1/y3$d;->j:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    sget-object v3, Ls1/y3$d;->C:Ls1/v1;

    :goto_0
    iput-object v3, v0, Ls1/y3$d;->l:Ls1/v1;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ls1/v1;->k:Ls1/v1$h;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ls1/v1$h;->h:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Ls1/y3$d;->k:Ljava/lang/Object;

    move-object v1, p3

    iput-object v1, v0, Ls1/y3$d;->m:Ljava/lang/Object;

    move-wide v3, p4

    iput-wide v3, v0, Ls1/y3$d;->n:J

    move-wide v3, p6

    iput-wide v3, v0, Ls1/y3$d;->o:J

    move-wide v3, p8

    iput-wide v3, v0, Ls1/y3$d;->p:J

    move v1, p10

    iput-boolean v1, v0, Ls1/y3$d;->q:Z

    move/from16 v1, p11

    iput-boolean v1, v0, Ls1/y3$d;->r:Z

    const/4 v1, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    iput-boolean v3, v0, Ls1/y3$d;->s:Z

    iput-object v2, v0, Ls1/y3$d;->t:Ls1/v1$g;

    move-wide/from16 v2, p13

    iput-wide v2, v0, Ls1/y3$d;->v:J

    move-wide/from16 v2, p15

    iput-wide v2, v0, Ls1/y3$d;->w:J

    move/from16 v2, p17

    iput v2, v0, Ls1/y3$d;->x:I

    move/from16 v2, p18

    iput v2, v0, Ls1/y3$d;->y:I

    move-wide/from16 v2, p19

    iput-wide v2, v0, Ls1/y3$d;->z:J

    iput-boolean v1, v0, Ls1/y3$d;->u:Z

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Ls1/y3$d;->j:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls1/y3$d;->l:Ls1/v1;

    invoke-virtual {v0}, Ls1/v1;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls1/y3$d;->m:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls1/y3$d;->t:Ls1/v1$g;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls1/v1$g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/y3$d;->n:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/y3$d;->o:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/y3$d;->p:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls1/y3$d;->q:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls1/y3$d;->r:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls1/y3$d;->u:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/y3$d;->v:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/y3$d;->w:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Ls1/y3$d;->x:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Ls1/y3$d;->y:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/y3$d;->z:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
