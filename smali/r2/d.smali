.class public final Lr2/d;
.super Lr2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/d$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr2/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:J

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:J

.field public final p:J

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr2/d$b;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Z

.field public final s:J

.field public final t:I

.field public final u:I

.field public final v:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr2/d$a;

    invoke-direct {v0}, Lr2/d$a;-><init>()V

    sput-object v0, Lr2/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(JZZZZJJLjava/util/List;ZJIII)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZZZJJ",
            "Ljava/util/List<",
            "Lr2/d$b;",
            ">;ZJIII)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Lr2/b;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lr2/d;->j:J

    move v1, p3

    iput-boolean v1, v0, Lr2/d;->k:Z

    move v1, p4

    iput-boolean v1, v0, Lr2/d;->l:Z

    move v1, p5

    iput-boolean v1, v0, Lr2/d;->m:Z

    move v1, p6

    iput-boolean v1, v0, Lr2/d;->n:Z

    move-wide v1, p7

    iput-wide v1, v0, Lr2/d;->o:J

    move-wide v1, p9

    iput-wide v1, v0, Lr2/d;->p:J

    invoke-static {p11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lr2/d;->q:Ljava/util/List;

    move v1, p12

    iput-boolean v1, v0, Lr2/d;->r:Z

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lr2/d;->s:J

    move/from16 v1, p15

    iput v1, v0, Lr2/d;->t:I

    move/from16 v1, p16

    iput v1, v0, Lr2/d;->u:I

    move/from16 v1, p17

    iput v1, v0, Lr2/d;->v:I

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    invoke-direct {p0}, Lr2/b;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lr2/d;->j:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lr2/d;->k:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lr2/d;->l:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lr2/d;->m:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lr2/d;->n:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lr2/d;->o:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lr2/d;->p:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v0, :cond_4

    invoke-static {p1}, Lr2/d$b;->a(Landroid/os/Parcel;)Lr2/d$b;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lr2/d;->q:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_5

    const/4 v1, 0x1

    :cond_5
    iput-boolean v1, p0, Lr2/d;->r:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lr2/d;->s:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lr2/d;->t:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lr2/d;->u:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lr2/d;->v:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lr2/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lr2/d;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method static a(Lp3/a0;JLp3/j0;)Lr2/d;
    .locals 27

    move-object/from16 v0, p3

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->I()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v1

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    if-nez v6, :cond_b

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v9

    and-int/lit16 v10, v9, 0x80

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    and-int/lit8 v11, v9, 0x40

    if-eqz v11, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    and-int/lit8 v12, v9, 0x20

    if-eqz v12, :cond_3

    const/4 v12, 0x1

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    :goto_3
    and-int/lit8 v9, v9, 0x10

    if-eqz v9, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    const/4 v9, 0x0

    :goto_4
    if-eqz v11, :cond_5

    if-nez v9, :cond_5

    invoke-static/range {p0 .. p2}, Lr2/g;->b(Lp3/a0;J)J

    move-result-wide v13

    goto :goto_5

    :cond_5
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    :goto_5
    if-nez v11, :cond_8

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v1

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v1, :cond_7

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v18

    if-nez v9, :cond_6

    invoke-static/range {p0 .. p2}, Lr2/g;->b(Lp3/a0;J)J

    move-result-wide v19

    move-wide/from16 v7, v19

    goto :goto_7

    :cond_6
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    :goto_7
    new-instance v5, Lr2/d$b;

    invoke-virtual {v0, v7, v8}, Lp3/j0;->b(J)J

    move-result-wide v21

    const/16 v23, 0x0

    move-object/from16 v17, v5

    move-wide/from16 v19, v7

    invoke-direct/range {v17 .. v23}, Lr2/d$b;-><init>(IJJLr2/d$a;)V

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_7
    move-object v1, v15

    :cond_8
    if-eqz v12, :cond_a

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v4

    int-to-long v4, v4

    const-wide/16 v7, 0x80

    and-long/2addr v7, v4

    const-wide/16 v17, 0x0

    cmp-long v12, v7, v17

    if-eqz v12, :cond_9

    const/16 v16, 0x1

    goto :goto_8

    :cond_9
    const/16 v16, 0x0

    :goto_8
    const-wide/16 v7, 0x1

    and-long/2addr v4, v7

    const/16 v7, 0x20

    shl-long/2addr v4, v7

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->I()J

    move-result-wide v7

    or-long/2addr v4, v7

    const-wide/16 v7, 0x3e8

    mul-long v4, v4, v7

    const-wide/16 v7, 0x5a

    div-long v7, v4, v7

    move/from16 v5, v16

    goto :goto_9

    :cond_a
    const/4 v5, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lp3/a0;->M()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lp3/a0;->G()I

    move-result v15

    move/from16 v16, v4

    move/from16 v24, v11

    move/from16 v17, v12

    move/from16 v18, v15

    move-object v12, v1

    move-wide/from16 v25, v13

    move v13, v5

    move-wide v14, v7

    move v7, v9

    move v5, v10

    move-wide/from16 v8, v25

    goto :goto_a

    :cond_b
    move-object v12, v1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, 0x0

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v24, 0x0

    :goto_a
    new-instance v19, Lr2/d;

    move-object/from16 v1, v19

    invoke-virtual {v0, v8, v9}, Lp3/j0;->b(J)J

    move-result-wide v10

    move v4, v6

    move/from16 v6, v24

    invoke-direct/range {v1 .. v18}, Lr2/d;-><init>(JZZZZJJLjava/util/List;ZJIII)V

    return-object v19
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lr2/d;->j:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean p2, p0, Lr2/d;->k:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lr2/d;->l:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lr2/d;->m:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lr2/d;->n:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-wide v0, p0, Lr2/d;->o:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lr2/d;->p:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lr2/d;->q:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    iget-object v1, p0, Lr2/d;->q:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/d$b;

    invoke-virtual {v1, p1}, Lr2/d$b;->b(Landroid/os/Parcel;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lr2/d;->r:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-wide v0, p0, Lr2/d;->s:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lr2/d;->t:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lr2/d;->u:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lr2/d;->v:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
