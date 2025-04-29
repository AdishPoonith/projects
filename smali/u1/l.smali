.class public final synthetic Lu1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/l;->j:Lu1/t$a;

    iput-object p2, p0, Lu1/l;->k:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/l;->j:Lu1/t$a;

    iget-object v1, p0, Lu1/l;->k:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lu1/t$a;->c(Lu1/t$a;Ljava/lang/Exception;)V

    return-void
.end method
