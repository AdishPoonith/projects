.class public abstract Ly2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly2/k$d;,
        Ly2/k$c;,
        Ly2/k$b;,
        Ly2/k$a;,
        Ly2/k$e;
    }
.end annotation


# instance fields
.field final a:Ly2/i;

.field final b:J

.field final c:J


# direct methods
.method public constructor <init>(Ly2/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/k;->a:Ly2/i;

    iput-wide p2, p0, Ly2/k;->b:J

    iput-wide p4, p0, Ly2/k;->c:J

    return-void
.end method


# virtual methods
.method public a(Ly2/j;)Ly2/i;
    .locals 0

    iget-object p1, p0, Ly2/k;->a:Ly2/i;

    return-object p1
.end method

.method public b()J
    .locals 6

    iget-wide v0, p0, Ly2/k;->c:J

    iget-wide v4, p0, Ly2/k;->b:J

    const-wide/32 v2, 0xf4240

    invoke-static/range {v0 .. v5}, Lp3/n0;->N0(JJJ)J

    move-result-wide v0

    return-wide v0
.end method
