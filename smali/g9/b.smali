.class public final synthetic Lg9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lg9/c;


# direct methods
.method public synthetic constructor <init>(Lg9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/b;->j:Lg9/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg9/b;->j:Lg9/c;

    invoke-static {v0}, Lg9/c;->a(Lg9/c;)V

    return-void
.end method
