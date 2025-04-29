.class public final synthetic Lq3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq3/x$a;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/s;->j:Lq3/x$a;

    iput-object p2, p0, Lq3/s;->k:Ljava/lang/String;

    iput-wide p3, p0, Lq3/s;->l:J

    iput-wide p5, p0, Lq3/s;->m:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lq3/s;->j:Lq3/x$a;

    iget-object v1, p0, Lq3/s;->k:Ljava/lang/String;

    iget-wide v2, p0, Lq3/s;->l:J

    iget-wide v4, p0, Lq3/s;->m:J

    invoke-static/range {v0 .. v5}, Lq3/x$a;->g(Lq3/x$a;Ljava/lang/String;JJ)V

    return-void
.end method
