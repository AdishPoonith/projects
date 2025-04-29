.class public final synthetic Lma/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lla/c1;


# instance fields
.field public final synthetic j:Lma/d;

.field public final synthetic k:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lma/d;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lma/c;->j:Lma/d;

    iput-object p2, p0, Lma/c;->k:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lma/c;->j:Lma/d;

    iget-object v1, p0, Lma/c;->k:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lma/d;->m0(Lma/d;Ljava/lang/Runnable;)V

    return-void
.end method
