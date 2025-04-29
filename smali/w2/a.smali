.class public abstract Lw2/a;
.super Lw2/n;
.source "SourceFile"


# instance fields
.field public final k:J

.field public final l:J

.field private m:Lw2/c;

.field private n:[I


# direct methods
.method public constructor <init>(Lo3/l;Lo3/p;Ls1/n1;ILjava/lang/Object;JJJJJ)V
    .locals 13

    move-object v12, p0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p14

    invoke-direct/range {v0 .. v11}, Lw2/n;-><init>(Lo3/l;Lo3/p;Ls1/n1;ILjava/lang/Object;JJJ)V

    move-wide/from16 v0, p10

    iput-wide v0, v12, Lw2/a;->k:J

    move-wide/from16 v0, p12

    iput-wide v0, v12, Lw2/a;->l:J

    return-void
.end method


# virtual methods
.method public final i(I)I
    .locals 1

    iget-object v0, p0, Lw2/a;->n:[I

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aget p1, v0, p1

    return p1
.end method

.method protected final j()Lw2/c;
    .locals 1

    iget-object v0, p0, Lw2/a;->m:Lw2/c;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw2/c;

    return-object v0
.end method

.method public k(Lw2/c;)V
    .locals 0

    iput-object p1, p0, Lw2/a;->m:Lw2/c;

    invoke-virtual {p1}, Lw2/c;->a()[I

    move-result-object p1

    iput-object p1, p0, Lw2/a;->n:[I

    return-void
.end method
