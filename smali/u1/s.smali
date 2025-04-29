.class public final synthetic Lu1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/s;->j:Lu1/t$a;

    iput-boolean p2, p0, Lu1/s;->k:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/s;->j:Lu1/t$a;

    iget-boolean v1, p0, Lu1/s;->k:Z

    invoke-static {v0, v1}, Lu1/t$a;->a(Lu1/t$a;Z)V

    return-void
.end method
