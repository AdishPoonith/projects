.class public final synthetic Lu1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/k;->j:Lu1/t$a;

    iput-wide p2, p0, Lu1/k;->k:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu1/k;->j:Lu1/t$a;

    iget-wide v1, p0, Lu1/k;->k:J

    invoke-static {v0, v1, v2}, Lu1/t$a;->h(Lu1/t$a;J)V

    return-void
.end method
