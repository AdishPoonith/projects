.class public Lx1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lx1/a$d;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J


# direct methods
.method public constructor <init>(Lx1/a$d;JJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/a$a;->a:Lx1/a$d;

    iput-wide p2, p0, Lx1/a$a;->b:J

    iput-wide p4, p0, Lx1/a$a;->c:J

    iput-wide p6, p0, Lx1/a$a;->d:J

    iput-wide p8, p0, Lx1/a$a;->e:J

    iput-wide p10, p0, Lx1/a$a;->f:J

    iput-wide p12, p0, Lx1/a$a;->g:J

    return-void
.end method

.method static synthetic a(Lx1/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/a$a;->c:J

    return-wide v0
.end method

.method static synthetic b(Lx1/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/a$a;->d:J

    return-wide v0
.end method

.method static synthetic c(Lx1/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/a$a;->e:J

    return-wide v0
.end method

.method static synthetic i(Lx1/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/a$a;->f:J

    return-wide v0
.end method

.method static synthetic j(Lx1/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/a$a;->g:J

    return-wide v0
.end method


# virtual methods
.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)Lx1/b0$a;
    .locals 13

    iget-object v0, p0, Lx1/a$a;->a:Lx1/a$d;

    invoke-interface {v0, p1, p2}, Lx1/a$d;->a(J)J

    move-result-wide v1

    iget-wide v3, p0, Lx1/a$a;->c:J

    iget-wide v5, p0, Lx1/a$a;->d:J

    iget-wide v7, p0, Lx1/a$a;->e:J

    iget-wide v9, p0, Lx1/a$a;->f:J

    iget-wide v11, p0, Lx1/a$a;->g:J

    invoke-static/range {v1 .. v12}, Lx1/a$c;->h(JJJJJJ)J

    move-result-wide v0

    new-instance v2, Lx1/b0$a;

    new-instance v3, Lx1/c0;

    invoke-direct {v3, p1, p2, v0, v1}, Lx1/c0;-><init>(JJ)V

    invoke-direct {v2, v3}, Lx1/b0$a;-><init>(Lx1/c0;)V

    return-object v2
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lx1/a$a;->b:J

    return-wide v0
.end method

.method public k(J)J
    .locals 1

    iget-object v0, p0, Lx1/a$a;->a:Lx1/a$d;

    invoke-interface {v0, p1, p2}, Lx1/a$d;->a(J)J

    move-result-wide p1

    return-wide p1
.end method
