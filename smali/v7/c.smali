.class public final synthetic Lv7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lv7/e$a;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lv7/e$a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/c;->j:Lv7/e$a;

    iput-object p2, p0, Lv7/c;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/c;->j:Lv7/e$a;

    iget-object v1, p0, Lv7/c;->k:Ljava/lang/Object;

    invoke-static {v0, v1}, Lv7/e$a;->e(Lv7/e$a;Ljava/lang/Object;)V

    return-void
.end method
