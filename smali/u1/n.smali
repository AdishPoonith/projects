.class public final synthetic Lu1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/n;->j:Lu1/t$a;

    iput-object p2, p0, Lu1/n;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/n;->j:Lu1/t$a;

    iget-object v1, p0, Lu1/n;->k:Ljava/lang/String;

    invoke-static {v0, v1}, Lu1/t$a;->g(Lu1/t$a;Ljava/lang/String;)V

    return-void
.end method
