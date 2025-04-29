.class public final synthetic Lu1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/o;->j:Lu1/t$a;

    iput-object p2, p0, Lu1/o;->k:Ljava/lang/String;

    iput-wide p3, p0, Lu1/o;->l:J

    iput-wide p5, p0, Lu1/o;->m:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu1/o;->j:Lu1/t$a;

    iget-object v1, p0, Lu1/o;->k:Ljava/lang/String;

    iget-wide v2, p0, Lu1/o;->l:J

    iget-wide v4, p0, Lu1/o;->m:J

    invoke-static/range {v0 .. v5}, Lu1/t$a;->f(Lu1/t$a;Ljava/lang/String;JJ)V

    return-void
.end method
